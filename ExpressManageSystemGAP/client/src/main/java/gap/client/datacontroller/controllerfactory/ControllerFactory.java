package gap.client.datacontroller.controllerfactory;

import gap.client.datacontroller.AccountDate.AccountDateController;
import gap.client.datacontroller.approvaldata.ApprovalDataController;
import gap.client.datacontroller.expressorderdata.ExpressOrderDataController;
import gap.client.datacontroller.inventorydata.FlexSectorDataController;
import gap.client.datacontroller.inventorydata.InventoryDataController;
import gap.client.datacontroller.inventorydata.WareHouseDataController;
import gap.client.datacontroller.logindata.LoginDataController;
import gap.client.datacontroller.managedata.InstitutionDataController;
import gap.client.datacontroller.orderdata.ArrivedOrderDataController;
import gap.client.datacontroller.orderdata.BillOrderDateController;
import gap.client.datacontroller.orderdata.DeliveryOrderDataController;
import gap.client.datacontroller.orderdata.LoadOrderDataController;
import gap.client.datacontroller.orderdata.StockinOrderDataController;
import gap.client.datacontroller.orderdata.StockoutOrderDataController;
import gap.client.datacontroller.strategydata.CityDataController;
import gap.client.datacontroller.strategydata.PriceDataController;
import gap.client.datacontroller.strategydata.RentDataController;
import gap.client.datacontroller.strategydata.SalaryDataController;
import gap.client.datacontroller.transdata.TransDataController;
import gap.client.datacontroller.userdata.UserDataController;

public class ControllerFactory {
	private static LoginDataController loginDataController;
	private static ExpressOrderDataController expressOrderDataController;
	private static LoadOrderDataController loadorderdatacontroller;
	private static ArrivedOrderDataController arrivedorderdatacontroller;
	private static DeliveryOrderDataController deliveryorderdatacontroller;
	private static InventoryDataController inventoryDataController;
	private static StockinOrderDataController stockinOrderDataController;
	private static StockoutOrderDataController stockoutOrderDataController;
	private static BillOrderDateController billorderdatacontroller;
	private static TransDataController transdatacontroller;
	private static AccountDateController accountDateController;
	private static InstitutionDataController institutionDataController;
	private static CityDataController cityDataController;
	private static PriceDataController priceDataController;
	private static RentDataController rentDataController;
	private static SalaryDataController salaryDataController;
	private static UserDataController userDataController;
<<<<<<< HEAD
	private static ApprovalDataController approvalDataController;
=======
	
	private static WareHouseDataController wareHouseDataController;
	private static FlexSectorDataController flexSectorDataController;
>>>>>>> origin/master

	public static AccountDateController getAccountDataController() {
		if (accountDateController == null) {
			accountDateController = new AccountDateController();
		}
		return accountDateController;
	}

	public static LoginDataController getLoginDataController() {
		if (loginDataController == null)
			loginDataController = new LoginDataController();
		return loginDataController;
	}

	public static ExpressOrderDataController getExpressOrderDataController() {
		if (expressOrderDataController == null)
			expressOrderDataController = new ExpressOrderDataController();
		return expressOrderDataController;
	}

	public static TransDataController getTransDataController() {
		if (transdatacontroller == null)
			transdatacontroller = new TransDataController();
		return transdatacontroller;
	}

	public static InventoryDataController getInventoryDataController() {
		if (inventoryDataController == null)
			inventoryDataController = new InventoryDataController();
		return inventoryDataController;
	}

	public static LoadOrderDataController getLoadOrderDataController() {
		if (loadorderdatacontroller == null)
			loadorderdatacontroller = new LoadOrderDataController();
		return loadorderdatacontroller;
	}

	public static ArrivedOrderDataController getArrivedOrderDataController() {
		if (arrivedorderdatacontroller == null)
			arrivedorderdatacontroller = new ArrivedOrderDataController();
		return arrivedorderdatacontroller;
	}

	public static BillOrderDateController getBillOrderDateController() {
		if (billorderdatacontroller == null)
			billorderdatacontroller = new BillOrderDateController();
		return billorderdatacontroller;
	}

	public static DeliveryOrderDataController getDeliveryOrderDataController() {
		if (deliveryorderdatacontroller == null)
			deliveryorderdatacontroller = new DeliveryOrderDataController();
		return deliveryorderdatacontroller;
	}

	public static StockinOrderDataController getStockinOrderDataController() {
		if (stockinOrderDataController == null)
			stockinOrderDataController = new StockinOrderDataController();
		return stockinOrderDataController;
	}

	public static StockoutOrderDataController getStockoutOrderDataController() {
		if (stockoutOrderDataController == null)
			stockoutOrderDataController = new StockoutOrderDataController();
		return stockoutOrderDataController;
	}

	public static InstitutionDataController getInstitutionDataController() {
		if (institutionDataController == null)
			institutionDataController = new InstitutionDataController();
		return institutionDataController;
	}

	public static CityDataController getCityDataController() {
		if (cityDataController == null)
			cityDataController = new CityDataController();
		return cityDataController;
	}

	public static RentDataController getRentDataController() {
		if (rentDataController == null)
			rentDataController = new RentDataController();
		return rentDataController;
	}

	public static PriceDataController getPriceDataController() {
		if (priceDataController == null)
			priceDataController = new PriceDataController();
		return priceDataController;
	}

	public static SalaryDataController getSalaryDataController() {
		if (salaryDataController == null)
			salaryDataController = new SalaryDataController();
		return salaryDataController;
	}

	public static UserDataController getUserDataController() {
		if (userDataController == null)
			userDataController = new UserDataController();
		return userDataController;
	}
<<<<<<< HEAD

	public static ApprovalDataController getApprovalDataController() {
		if (approvalDataController == null)
			approvalDataController = new ApprovalDataController();
		return approvalDataController;
=======
	
	public static WareHouseDataController getWareHouseDataController() {
		if (wareHouseDataController == null)
			wareHouseDataController = new WareHouseDataController();
		return wareHouseDataController;
	}
	
	public static FlexSectorDataController getFlexSectorDataController() {
		if (flexSectorDataController == null)
			flexSectorDataController = new FlexSectorDataController();
		return flexSectorDataController;
>>>>>>> origin/master
	}
}
