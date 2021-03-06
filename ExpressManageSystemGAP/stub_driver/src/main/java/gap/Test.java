package gap;

import gap.client.bl.distance.City;
import gap.client.bl.distance.DistanceCal;
import gap.client.bl.expressorder.ExpressOrder;
import gap.client.bl.expressorder.PriceCalImpl;
import gap.client.vo.ExpressOrderVO;
import gap.common.util.Address;
import gap.common.util.CargoInfo;
import gap.common.util.ExpressType;
import gap.common.util.PeopleInfo;
import gap.mockobject.MockCity;
import gap.mockobject.MockDistanceCal;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ExpressOrder expressorder;
		PriceCalImpl prical;
		DistanceCal discal;
		City city;

		discal = new MockDistanceCal();
		city = new MockCity(discal);
		prical = new PriceCalImpl(city);
		expressorder = new ExpressOrder(prical);

		Address add1 = new Address("江苏省", "南京市", "玄武区");
		Address add2 = new Address("北京市", "北京市", "东城区");
		PeopleInfo sender = new PeopleInfo("杨雁飞", add1, "南京大学", "15520065137");
		PeopleInfo receiver = new PeopleInfo("张家盛", add2, "北京大学", "119");
		CargoInfo cargo = new CargoInfo(2, 2.5, 3.5, "测试");
		ExpressOrderVO vo = new ExpressOrderVO(sender, receiver,
				ExpressType.EXPRESS, 20.5, cargo, false, "0000000003",
				"0010001", null);
		ExpressOrderVO newVO = expressorder.createOrder(vo);
		System.out.println(newVO.price);
	}

}
