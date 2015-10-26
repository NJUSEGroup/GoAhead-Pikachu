package stub_drivers.dataservice.driverdata;

import dataservice.transdataservice.DriverDataService;
import po.DriverPO;
import util.Gender;
import util.ResultMessage;

public class DriverDataService_driver {
	public void drive(DriverDataService driverData) {
		DriverPO driver1 = new DriverPO("0011001001", "0011001", "yyf",
				"19960301", "500113199603013932", "15520065137", "20200101",
				Gender.MALE);
		DriverPO driver2 = new DriverPO("0010001001", "0010001", "txy",
				"19700101", "500000000000000000", "119", "20200101",
				Gender.FEMALE);
		System.out.println("add succeed");

		if (driverData.add(driver2).equals(ResultMessage.SUCCEED)) {
			System.out.println("add succeed");
		}
		if (driverData.add(driver1).equals(ResultMessage.EXITED)) {
			System.out.println("add failed,Driver exited");
		}
		DriverPO get = driverData.find("0011001001");
		if (get != null)
			System.out.println("find:id=" + get.getId() + ",name="
					+ get.getName() + ",gender=" + get.getGender() + ",phone="
					+ get.getPhone());
		get = driverData.find("0011001002");
		if (get == null)
			System.out.println("find failed,not found");
		driver1.setPhone("110");
		if (driverData.modify(driver1).equals(ResultMessage.SUCCEED))
			System.out.println("modify succeed");
		if (driverData.delete("0010001001").equals(ResultMessage.SUCCEED))
			System.out.println("delete succeed");
		if (driverData.delete("0010001002").equals(ResultMessage.NOTFOUND))
			System.out.println("delete failed,not found");
	}

	public static void main(String[] args) {
		DriverDataService driverData = new DriverDataService_stub();
		DriverDataService_driver driver = new DriverDataService_driver();
		driver.drive(driverData);

	}
}
