package gap.client.ui.administratorui;

/**
 * 管理员用户管理界面
 * 
 * @author seven
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import gap.client.blcontroller.UserController;
import gap.client.ui.BaseComponents.MainFrame;
import gap.client.ui.BaseComponents.MainPanel;
import gap.client.ui.UITools.SwingConsole;
import gap.client.ui.gapcomponents.ButtonArea;
import gap.client.vo.UserVO;
import gap.common.util.UserType;

public class UserPanel extends MainPanel {
	UserVO searchUser = null;
	TitlePanel titlePanel;
	QueryPanel queryPanel;
	ListItemPanel listItemPanel;
	ButtonArea buttonArea;
	final GridBagLayout gb;
	final GridBagConstraints gcons;

	public UserPanel(final MainFrame frame, final UserType userType) {
		// TODO Auto-generated constructor stub
		super(frame);
		titlePanel = new TitlePanel();
		queryPanel = new QueryPanel(userType);

		listItemPanel = new ListItemPanel(frame, userType, searchUser);
		buttonArea = new ButtonArea();

		buttonArea.submit.setText("提交修改");
		// 修改按钮添加监听
		buttonArea.submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				UserController.flush();
			}

		});
		// 搜索按钮添加监听
		QueryPanel.search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int resultNum = 1;
				QueryPanel.total.setText("一共有" + resultNum + "条结果");
				searchUser = UserController.findById(QueryPanel.userid_jt.getText());
				UserPanel.this.remove(listItemPanel);
				listItemPanel = new ListItemPanel(frame, userType, searchUser);
				SwingConsole.addComponent(gb, gcons, UserPanel.this, listItemPanel, 0, 2, 1, 1, 1, 0);
				frame.validate();
			}
		});
		gb = new GridBagLayout();
		gcons = new GridBagConstraints();
		setLayout(gb);
		JPanel jp = new JPanel();
		jp.setOpaque(false);
		SwingConsole.addComponent(gb, gcons, this, queryPanel, 0, 0, 1, 1, 1, 0);
		SwingConsole.addComponent(gb, gcons, this, titlePanel, 0, 1, 1, 1, 1, 0);
		SwingConsole.addComponent(gb, gcons, this, listItemPanel, 0, 2, 1, 1, 1, 0);
		SwingConsole.addComponent(gb, gcons, this, jp, 0, 3, 1, 1, 1, 1);
		SwingConsole.addComponent(gb, gcons, this, buttonArea, 0, 4, 1, 1, 1, 0);
	}
}