package gap.client.ui.paymentUI;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import gap.client.ui.UITools.RenderSetter;
import gap.client.ui.UITools.SwingConsole;
import gap.client.ui.gapcomponents.ComponentStyle;
import gap.client.ui.gapcomponents.GAPLabel;

public class PaymentTableHeader extends PanelWithGrid{
	
	GAPLabel payDate;
	GAPLabel recevier;
	GAPLabel account;
	//条目，如快递员工资，业务员工资
	GAPLabel item;
	GAPLabel money;
	//备注，如12月工资，运单号
	GAPLabel comment;
	JLabel[] components;
	
	public static final int leftGap = 100;
	
	public static final int height = 50;
	public static final int payDateWidth = 100;
	public static final int recevierWidth = 60;
	public static final int accountWidth = 100;
	public static final int itemWidth = 140;
	public static final int moneyWidth = 100;
	public static final int commentWidth = 100;
	
	public static int[] widthArgs;
	static{
		widthArgs = new int[6];
		widthArgs[0] = payDateWidth;
		widthArgs[1] = recevierWidth;
		widthArgs[2] = accountWidth;
		widthArgs[3] = itemWidth;
		widthArgs[4] = moneyWidth;
		widthArgs[5] = commentWidth;
	}
	
	public PaymentTableHeader(){
		
		
		payDate = new GAPLabel("付款日期");
		recevier = new GAPLabel("收款方");
		account = new GAPLabel("付款账号");
		item = new GAPLabel("条目");
		money = new GAPLabel("付款金额");
		comment = new GAPLabel("备注");
		
		components = new JLabel[6];
		components[0] = payDate;
		components[1] = recevier;
		components[2] = account;
		components[3] = item;
		components[4] = money;
		components[5] = comment;
		
		setBackground(Color.white);
		
		for(int i=0;i<components.length;i++){
			components[i].setHorizontalAlignment(JLabel.CENTER);
			components[i].setPreferredSize(new Dimension(widthArgs[i], height));
		}
		
		for(int i=0;i<components.length;i++){
			if(i==0){
				gridBagConstraints.insets = new Insets(20, 100, 20, 0);
			}else{
				gridBagConstraints.insets = new Insets(20, 0, 20, 0);
			}
			
			SwingConsole.addComponent(gridBagLayout, gridBagConstraints, 
					this, components[i], i, 0, 1, 1, 0.5, 0.5);
		}
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = RenderSetter.OpenRender(g);
		g2d.setStroke(new BasicStroke(1.0f));
		g2d.setColor(Color.gray);
		int width = getWidth();
		g2d.drawLine(5, getHeight()-5, width, getHeight()-5);
	}
	
//	public static void main(String[] args) {
//	
//	
//	JFrame frame = new JFrame("test");
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	//frame.setLayout(null);
//	frame.setSize(800, 600);
//	
////	PayeeVO vo = new PayeeVO(PaymentType.BUSSINESSCLERK, "00110011",
////				"小花", null, 1000, "主账户", "营业厅业务员工资", "12月工资");
////	ArrayList<AccountVO> accountVOs = new ArrayList<>();
////	accountVOs.add(new AccountVO("账户111111111",8000));
////	accountVOs.add(new AccountVO("账户2",8000));
////	accountVOs.add(new AccountVO("账户3",8000));
////	PayeeItem payeeItem = new PayeeItem(vo, accountVOs);
//	frame.add(new PaymentTableHeader());
//	
//	frame.setVisible(true);
//
//
//}
	
}
