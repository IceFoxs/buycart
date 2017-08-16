package buycart;

import java.util.Date;
public class OrdersHandler {
	public Orders  orderHander(String oid, Date date,  RecInfo[] recInfos, BuyCart buyCart){
		RecInfo recInfo=null;
		for(RecInfo temp :recInfos) {
			if(temp.isDefault()) {
				recInfo=temp;
			}
		}
		Orders orders  = new Orders(oid,date,recInfo,buyCart);
		return orders;
	}
	@SuppressWarnings("deprecation")
	public void  showOrder(Orders orders){
		  System.out.println("�������Ϊ"+orders.getOid());
//		  System.out.println("�������ڣ�"+orders.getDate().getYear()+
//				  "��"+orders.getDate().getMonth()+
//				  "��"+orders.getDate().getDay()+
//				  "��"+orders.getDate().getHours()+
//				  "��"+orders.getDate().getMinutes()+"��"
//				  );
		  System.out.println("�������ڣ�"+orders.getDate().toString());
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
