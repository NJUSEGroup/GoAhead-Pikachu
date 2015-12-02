package gap.client.vo;

import java.util.ArrayList;
import java.util.Calendar;

import gap.common.po.PayeePO;
import gap.common.po.PaymentListPO;

public class PaymentListVO {

	public ArrayList<PayeeVO> paymentList;
	private String paymentID;
	private Calendar payDate;
	private String payer;
	private double total = 0;
	
	public PaymentListVO(String ID,String payer,double total,Calendar calendar){
		initial(ID, payer, total, calendar,null);		
	}
	
	public PaymentListVO(PaymentListPO po){
		initial(po.getPaymentID(), po.getPayer(), po.getTotal(), po.getPayDate(),po.paymentList);
	}
	
	private void initial(String ID,String payer,double total
			,Calendar calendar,ArrayList<PayeePO> list)
	{
		setPaymentID(ID);
		this.setPayer(payer);
		this.setTotal(total);
		this.payDate = calendar;
		paymentList = new ArrayList<>();
		
		if(list!=null){
			for(PayeePO po:list){
				paymentList.add(new PayeeVO(po));
			}
		}
		
	}
	
	public PaymentListPO toPO()
	{
		PaymentListPO po = new PaymentListPO(paymentID, payer,total, payDate);
		for(PayeeVO vo:paymentList){
			po.paymentList.add(vo.toPO());
		}
		return po;
		
	}


	public Calendar getPayDate() {	
		return payDate;
	}

	public void setPayDate(Calendar payDate) {
		this.payDate = payDate;
	}

	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}



	public String getPayer() {
		return payer;
	}



	public void setPayer(String payer) {
		this.payer = payer;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}
	
}
