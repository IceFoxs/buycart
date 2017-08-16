package buycart;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Orders {	
	private String oid;
	private Date date;
	private RecInfo recInfo;
	private BuyCart buyCart;
	public Orders(String oid, Date date, RecInfo recInfo, BuyCart buyCart) {
		this.oid = oid;
		this.date = date;
		this.recInfo = recInfo;
		this.buyCart = buyCart;
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public RecInfo getRecInfo() {
		return recInfo;
	}

	public void setRecInfo(RecInfo recInfo) {
		this.recInfo = recInfo;
	}

	public BuyCart getBuyCart() {
		return buyCart;
	}

	public void setBuyCart(BuyCart buyCart) {
		this.buyCart = buyCart;
	}
	@Override
	public String toString() {
		  String str="订单编号为"+this.getOid().toString()+"\n";
		  SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
		  str+="创建日期："+dateFormat.format(this.getDate())+"\n";
//		  Calendar ca=Calendar.getInstance();
//		  ca.setTime(orders.getDate());
//		  System.out.println("创建日期："+ca.get(Calendar.YEAR)+
//				  "年"+(ca.get(Calendar.MONTH)+1)+
//				  "月"+ca.get(Calendar.DAY_OF_MONTH)+
//				  "日"+ca.get(Calendar.HOUR_OF_DAY)+
//				  "点"+ca.get(Calendar.MINUTE)+"分"
//				  +ca.get(Calendar.SECOND)+"秒"
//				  );
		  if(this.getRecInfo()!=null) {
			 str+="收件人姓名："+this.getRecInfo().getRecName()
					             +"   收件人地址"+this.getRecInfo().getAddr()+"\n";
		  }
		  double  sumPrice=0;
		  for(Item temp:this.getBuyCart().getItems()) {
			   double price=temp.getProduct().getPrice()*temp.getAmount();
			   sumPrice+=price;
		       str+=temp.getProduct().getName()+" 个数:"+temp.getAmount()+
		                          "  合计"+price+"元\n";
		  }
		 str+=" 总价:"+sumPrice+"元\n";
		 return str;
	}
}
