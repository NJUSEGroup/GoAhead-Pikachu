package gap.client.bl.order;

import gap.client.blservice.orderblservice.ArrivedOrderService;
import gap.client.datacontroller.ArrivedOrderDataController;
import gap.client.datacontroller.ControllerFactory;
import gap.client.vo.ArrivedOrderVO;
import gap.client.vo.ExpressOrderVO;
import gap.common.util.ResultMessage;

import java.util.List;

public class ArrivedOrder implements ArrivedOrderService {

	ArrivedOrderDataController arrivedOrderData;

	public ArrivedOrder() {
		arrivedOrderData = ControllerFactory.getArrivedOrderDataController();
	}

	@Override
	public ArrivedOrderVO create(List<ExpressOrderVO> orders,
			ArrivedOrderVO orderinfo) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage save(ArrivedOrderVO order) {
		// TODO 自动生成的方法存根
		return arrivedOrderData.add(order.toPO());
	}

	@Override
	public ArrivedOrderVO find(String id) {
		// TODO 自动生成的方法存根
		return null;
	}

}
