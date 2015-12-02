package gap.client.ui.bussinessui;

import gap.client.ui.BaseComponents.MainFrame;
import gap.client.ui.BaseComponents.MainPanel;
import gap.client.ui.UITools.SwingConsole;
import gap.client.ui.gapcomponents.GAPJScrollPane;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class DriverManagePanel extends MainPanel {
	QueryPanel queryPanel;
	TitlePanel titlePanel;
	ListItemPanel  listItem;

	public DriverManagePanel(MainFrame frame) {
		super(frame);
		queryPanel = new QueryPanel();
		titlePanel = new TitlePanel();
		listItem=new ListItemPanel();

		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gcons = new GridBagConstraints();
		setLayout(gb);

		JPanel jp = new JPanel();
//		jp.setBackground(Color.red);
		 jp.setOpaque(false);
		SwingConsole
				.addComponent(gb, gcons, this, queryPanel, 0, 0, 1, 1, 1, 0);
		SwingConsole
				.addComponent(gb, gcons, this, titlePanel, 0, 1, 1, 1, 1, 0);
		SwingConsole.addComponent(gb, gcons, this, listItem, 0, 2, 1, 1, 1, 0);
		SwingConsole.addComponent(gb, gcons, this, jp, 0, 3, 1, 1, 1, 1);
		// TODO 自动生成的构造函数存根
	}

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		DriverManagePanel pa = new DriverManagePanel(null);
		JScrollPane js = new GAPJScrollPane(pa);

		jf.setContentPane(js);
		// jf.getContentPane().add(pa);
		jf.setSize(1024, 768);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
