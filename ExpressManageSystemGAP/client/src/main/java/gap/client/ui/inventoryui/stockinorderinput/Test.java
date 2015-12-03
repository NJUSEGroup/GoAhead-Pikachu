package gap.client.ui.inventoryui.stockinorderinput;

import gap.client.ui.BaseComponents.MainFrame;
import gap.client.ui.BaseComponents.UserBox.Sex;
import gap.client.ui.UITools.ConstInfo;
import gap.client.ui.deliveryui.expressorderinput.ExpressorderInputPanel;

public class Test {
	public static void main(String []args){
		ConstInfo.setJob("库存管理人员");
		ConstInfo.setName("王小二");
		ConstInfo.setNumber("000000001");
		ConstInfo.setSex(Sex.man);
		MainFrame mainFrame=new MainFrame();
		StockinOrderInputPanel panel=new StockinOrderInputPanel(mainFrame);
		mainFrame.setMainPanel(panel);
	}
}