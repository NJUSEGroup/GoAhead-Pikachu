package gap.client.bl.order;

import gap.client.blservice.orderblservice.StockinOrderService;
import gap.client.datacontroller.ControllerFactory;
import gap.client.datacontroller.StockinOrderDataController;
import gap.client.util.LocalInfo;
import gap.client.vo.ExpressOrderVO;
import gap.client.vo.GoodsVO;
import gap.client.vo.StockinOrderVO;
import gap.common.util.ResultMessage;

import java.util.List;

public class StockinOrder implements StockinOrderService {
	StockinOrderDataController stockinData;

	public StockinOrder() {
		stockinData = ControllerFactory.getStockinOrderDataController();
	}

	@Override
	public StockinOrderVO create(List<ExpressOrderVO> orders,
			StockinOrderVO orderinfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage save(StockinOrderVO order) {
		// TODO Auto-generated method stub
		String date = order.getInDate().replaceAll("-", "");
		String pre = LocalInfo.ins_id + date;
//		String id = "" + loadDataController.nextId(LocalInfo.ins_id + date);
//		while (id.length() < 5)
//			id = "0" + id;
//		order.order_id = pre + id;
		return stockinData.add(order.toPO());
	}

	@Override
	public StockinOrderVO find(String id,String ins_id) {
		// TODO Auto-generated method stub
		return new StockinOrderVO(stockinData.find(id, ins_id));
	}

	@Override
	public String getLocation(GoodsVO vo) {
		// TODO Auto-generated method stub
		return null;
	}


}
