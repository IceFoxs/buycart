package buycart;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class OrdersHandler {
	public Orders  orderHander(String oid, Date date,  RecInfo[] recInfos, BuyCart buyCart){
		RecInfo recInfo=null;
		for(RecInfo temp :recInfos) {
			if(temp.isDefault()) {
				recInfo=temp;
				break;
			}
		}
		Orders orders  = new Orders(oid,date,recInfo,buyCart);
		return orders;
	}
	@SuppressWarnings("deprecation")
	public void  showOrder(Orders orders){
		  System.out.println("�������Ϊ"+orders.getOid());
//		  System.out.println("�������ڣ�"+orders.getDate().toString());
		  Calendar ca=Calendar.getInstance();
		  ca.setTime(orders.getDate());
		  System.out.println("�������ڣ�"+ca.get(Calendar.YEAR)+
				  "��"+(ca.get(Calendar.MONTH)+1)+
				  "��"+ca.get(Calendar.DAY_OF_MONTH)+
				  "��"+ca.get(Calendar.HOUR_OF_DAY)+
				  "��"+ca.get(Calendar.MINUTE)+"��"
				  +ca.get(Calendar.SECOND)+"��"
				  );
		  if(orders.getRecInfo()!=null) {
			  System.out.println("�ռ���������"+orders.getRecInfo().getRecName()
					             +"   �ռ��˵�ַ"+orders.getRecInfo().getAddr());
		  }
		  double  sumPrice=0;
		  for(Item temp:orders.getBuyCart().getItems()) {
			   double price=temp.getProduct().getPrice()*temp.getAmount();
			   sumPrice+=price;
		       System.out.println(temp.getProduct().getName()+" ����:"+temp.getAmount()+
		                          "  �ϼ�"+price+"Ԫ");
		  }
		  System.out.println(" �ܼ�:"+sumPrice+"Ԫ");
	}
}
