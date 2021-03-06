package stub_drivers.dataservice.loadorder;

import po.LoadOrderPO;
import util.ResultMessage;
import dataservice.orderdataservice.LoadOrderDataService;

public class LoadOrderDataService_driver {
	public void drive(LoadOrderDataService arrivedOrder) {
		LoadOrderPO po = new LoadOrderPO("19700101", "00100011970010100001",
				"0010001", "0011001", "", "", null);
		if (arrivedOrder.add(po).equals(ResultMessage.SUCCEED)) {
			System.out.println("add succeed!");
		}
		if (arrivedOrder.add(po).equals(ResultMessage.EXITED)) {
			System.out.println("add failed,order exited");
		}
		LoadOrderPO get = arrivedOrder.find("00100011970010100001");
		if (get != null)
			System.out.println("find:id=" + get.getNumber() + ",date="
					+ get.getDate());
		get = arrivedOrder.find("001100119700101000001");
		if (get == null)
			System.out.println("not found");
	}

	public static void main(String[] args) {
		LoadOrderDataService_driver driver = new LoadOrderDataService_driver();
		LoadOrderDataService arrivedOrder = new LoadOrderDataService_stub();
		driver.drive(arrivedOrder);

	}
}
