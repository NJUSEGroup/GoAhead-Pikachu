package stub_drivers.dataservice.arrivedorderdata;

import dataservice.orderdataservice.ArrivedOrderDataService;

import po.ArrivedOrderPO;
import util.ResultMessage;

public class ArrivedOrderDataService_driver {
	public void drive(ArrivedOrderDataService arrivedOrder) {
		ArrivedOrderPO po = new ArrivedOrderPO(null, "19700101",
				"00100011970010100001");
		if (arrivedOrder.add(po).equals(ResultMessage.SUCCEED)) {
			System.out.println("add succeed!");
		}
		if (arrivedOrder.add(po).equals(ResultMessage.EXITED)) {
			System.out.println("add failed,order exited");
		}
		ArrivedOrderPO get = arrivedOrder.find("00100011970010100001");
		if (get != null)
			System.out.println("find:id=" + get.getId() + ",date="
					+ get.getTime());
		get = arrivedOrder.find("001100119700101000001");
		if (get == null)
			System.out.println("not found");
	}

	public static void main(String[] args) {
		ArrivedOrderDataService_driver driver = new ArrivedOrderDataService_driver();
		ArrivedOrderDataService arrivedOrder = new ArrivedOrderDataService_stub();
		driver.drive(arrivedOrder);

	}
}
