package gap.client.ui.BaseComponents.FrameInitialler;

import gap.client.ui.AccountUI.AccountManagePanel;
import gap.client.ui.BaseComponents.MainFrame;
import gap.client.ui.BaseComponents.NavigateBar;
import gap.client.ui.BaseComponents.NavigateButton;
import gap.client.ui.bussinessui.arrivedorder.ArrivedOrderPanel;
import gap.client.ui.bussinessui.loadorder.LoadOrderPanel;
import gap.client.ui.paymentUI.PaymentMainPanel;
import gap.client.ui.tableUI.Cost_profitUI.CostProfitPanel;
import gap.client.util.MessageType;

public class AccountorInitialler {
	public static void initialAccountor(MainFrame mainFrame){
		NavigateBar navBar = mainFrame.getNavigateBar();
		NavigateButton accountManage = new NavigateButton(mainFrame,
				new AccountManagePanel(mainFrame),navBar, "账户管理");
		NavigateButton payment = new NavigateButton(mainFrame,
				new PaymentMainPanel(mainFrame), navBar, "制定付款单");
		NavigateButton costProfit = new NavigateButton(mainFrame,
				new CostProfitPanel(mainFrame), navBar, "成本收益");


		navBar.addButton(accountManage);
		navBar.addButton(payment);
		navBar.addButton(costProfit);
		navBar.setSelect(costProfit);
		mainFrame.setVisible(true);
		MainFrame.setMessage("登录成功", MessageType.succeed, 3000);	
		
	}
}