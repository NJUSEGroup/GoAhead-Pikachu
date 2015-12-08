package gap.client.blservice.inventoryblservice;

import gap.client.vo.ExpressOrderVO;
import gap.client.vo.GoodsVO;
import gap.client.vo.StockCountVO;
import gap.client.vo.StockObVO;
import gap.client.vo.StockinOrderVO;
import gap.client.vo.StockoutOrderVO;
import gap.common.util.ResultMessage;

import java.util.List;

public interface InventoryService {
//	/**
//	 * 查看库存信息，一个时间段内出入库数量
//	 * @param begin
//	 * @param end
//	 * @return
//	 */
//	public StockObVO observeStock(String beginDate, String endDate,
//			String ins_id);
//
//	/**
//	 * 库存盘点
//	 * @return
//	 */
//	public StockCountVO countStock(String ins_id);
	
	
	public List<GoodsVO> getOneSector(String ins_id, String sector_id);

	public int getOneSectorNum(String ins_id, String sector_id);

	/**
	 * 设置警戒值
	 * @param alarmValue
	 * @return
	 */
	public ResultMessage setAlarm(double alarmValue, String ins_id);

	public double getAlarm(String ins_id);
	
	public String Alarm();

	/**
	 * 调整库存分区，选择分配区域及分配给的分区
	 * @param beginColumn
	 * @param endColumn
	 * @param toSector
	 * @return
	 */
	public ResultMessage distributeSector(String beginColumn, String endColumn,
			String toSector);

	/**
	 * 库存信息初始化，增删改
	 * @param expressorder
	 * @param location
	 * @return
	 */
	public void initialadd(GoodsVO vo);

	public void initialdelete(String id);

	public void initialmodify(GoodsVO vo);

	public ResultMessage initialflush();

	/**
	 * 获得到达的快递
	 * @param institution_id
	 * @return
	 */
	public List<ExpressOrderVO> getArrivedOrders(String ins_id);

	/**
	 * 快递入库
	 * @param expressorder
	 * @param ins_center_id
	 * @return
	 */

	public String stockIn(ExpressOrderVO expressorder, String ins_id);
	
	public String getNextLocation(String ins_id,String sector_id);

	/**
	 * 快递出库，填写快递编号设置目的地，货运方式
	 * @param destination
	 * @param transportation
	 * @param expressorder_id
	 */
	public void stockOut(String destination, String transportation,
			String expressorder_id, String ins_center_id);

//	/**
//	 * 生成入库单
//	 * @param expressorders
//	 * @return
//	 */
//	public StockinOrderVO createStockinOrder(List<String> expressorders_id);
//
//	/**
//	 * 生成出库单
//	 * @param expressorders
//	 * @return
//	 */
//	public StockoutOrderVO createStockoutOrder(List<GoodsVO> expressorders);

	/**
	 * 查找单个快递
	 * @param expressorder_id
	 * @return
	 */
	public ExpressOrderVO getSingleExpressOrder(String expressorder_id);

	

	

}
