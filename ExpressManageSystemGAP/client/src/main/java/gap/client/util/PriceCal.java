package gap.client.util;

import gap.client.vo.ExpressOrderVO;

public abstract class PriceCal {
	//返回价格
	public abstract double getPrice(ExpressOrderVO vo);

}
