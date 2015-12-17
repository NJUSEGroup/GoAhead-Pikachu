package gap.client.ui.paymentUI.paymentDetail;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JComponent;
import javax.swing.JLabel;

import gap.client.ui.UITools.SwingConsole;
import gap.client.ui.gapcomponents.GAPComboBox;
import gap.client.ui.gapcomponents.GAPLabel;
import gap.client.ui.paymentUI.PanelWithGrid;
import gap.client.ui.paymentUI.PaymentTableHeader;
import gap.client.vo.AccountVO;
import gap.client.vo.PayeeVO;

public class DetailItem extends PanelWithGrid{
	
	PayeeVO vo;
	
	GAPLabel payDate;
	GAPLabel recevier;
	GAPLabel accountLabel;
	//条目，如快递员工资，业务员工资

	GAPLabel money;
	//备注，如12月工资，运单号
	GAPLabel comment;
	
	JLabel empty;
	
	
	JComponent[] components;
	
	private static String dateString=null; 
	
	public DetailItem(PayeeVO vo){
		this.vo = vo;

		setBackground(Color.white);
		if(dateString==null){
			Calendar calendar = Calendar.getInstance();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			dateString = format.format(calendar.getTime());
		}
		
		payDate = new GAPLabel(dateString);
		recevier = new GAPLabel(vo.getUserName());
		
		accountLabel = new GAPLabel(vo.getAccountName());
		
		String moneyString = String.format("%.2f", vo.getMoney());
		money = new GAPLabel(moneyString+"元");
		comment = new GAPLabel(vo.getNote());
		
		empty = new JLabel();
		
		components = new JComponent[6];
		components[0] = payDate;
		components[1] = recevier;
		components[2] = accountLabel;
		components[3] = money;
		components[4] = comment;
		components[5] = empty;
		
		gridBagConstraints.anchor = GridBagConstraints.CENTER;
		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		
		for(int i=0;i<components.length;i++){
			
			if(components[i]==accountLabel){
				components[i].setPreferredSize
				(new Dimension(PaymentTableHeader.widthArgs[i], 25));
			}
			if(components[i] instanceof JLabel){
				JLabel label = (JLabel) components[i];
				label.setHorizontalAlignment(JLabel.CENTER);
				components[i].setPreferredSize
				(new Dimension(PaymentTableHeader.widthArgs[i], PaymentTableHeader.height));
			}
			
			SwingConsole.addComponent
			(gridBagLayout, gridBagConstraints, this,components[i], i, 0, 1, 1,1, 1);
			
		}
		
		
	}
	
}
