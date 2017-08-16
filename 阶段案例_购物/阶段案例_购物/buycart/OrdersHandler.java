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
		  System.out.println("订单编号为"+orders.getOid());
//		  System.out.println("创建日期："+orders.getDate().toString());
		  Calendar ca=Calendar.getInstance();
		  ca.setTime(orders.getDate());
		  System.out.println("创建日期："+ca.get(Calendar.YEAR)+
				  "年"+(ca.get(Calendar.MONTH)+1)+
				  "月"+ca.get(Calendar.DAY_OF_MONTH)+
				  "日"+ca.get(Calendar.HOUR_OF_DAY)+
				  "点"+ca.get(Calendar.MINUTE)+"分"
				  +ca.get(Calendar.SECOND)+"秒"
				  );
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
