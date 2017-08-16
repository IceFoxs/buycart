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
		  System.out.println("订单编号为"+orders.getOid());
//		  System.out.println("创建日期："+orders.getDate().getYear()+
//				  "年"+orders.getDate().getMonth()+
//				  "月"+orders.getDate().getDay()+
//				  "日"+orders.getDate().getHours()+
//				  "点"+orders.getDate().getMinutes()+"分"
//				  );
		  System.out.println("创建日期："+orders.getDate().toString());
		  if(orders.getRecInfo()!=null) {
			  System.out.println("收件人姓名："+orders.getRecInfo().getRecName()
					             +"   收件人地址"+orders.getRecInfo().getAddr());
		  }
		  double  sumPrice=0;
		  for(Item temp:orders.getBuyCart().getItems()) {
			   double price=temp.getProduct().getPrice()*temp.getAmount();
			   sumPrice+=price;
		       System.out.println(temp.getProduct().getName()+" 个数:"+temp.getAmount()+
		                          "  合计"+price+"元");
		  }
		  System.out.println(" 总价:"+sumPrice+"元");
	}
}
