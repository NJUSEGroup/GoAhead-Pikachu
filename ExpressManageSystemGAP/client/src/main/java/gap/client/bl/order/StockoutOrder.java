package gap.client.bl.order;

import java.util.List;

import gap.client.blservice.orderblservice.StockoutOrderService;
import gap.client.datacontroller.controllerfactory.ControllerFactory;
import gap.client.datacontroller.orderdata.StockinOrderDataController;
import gap.client.datacontroller.orderdata.StockoutOrderDataController;
import gap.client.vo.ExpressOrderVO;
import gap.client.vo.StockoutOrderVO;
import gap.common.util.ResultMessage;

public class StockoutOrder implements StockoutOrderService {
	StockoutOrderDataController stockoutData;

	public StockoutOrder() {
		stockoutData = ControllerFactory.getStockoutOrderDataController();
	}

	@Override
	public StockoutOrderVO create(List<ExpressOrderVO> orders,
			StockoutOrderVO orderinfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage save(StockoutOrderVO order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockoutOrderVO find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOrdersNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
