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
		  String str="�������Ϊ"+this.getOid().toString()+"\n";
		  SimpleDateFormat  dateFormat = new SimpleDateFormat("yyyy��MM��dd��HH��mm��ss��");
		  str+="�������ڣ�"+dateFormat.format(this.getDate())+"\n";
//		  Calendar ca=Calendar.getInstance();
//		  ca.setTime(orders.getDate());
//		  System.out.println("�������ڣ�"+ca.get(Calendar.YEAR)+
//				  "��"+(ca.get(Calendar.MONTH)+1)+
//				  "��"+ca.get(Calendar.DAY_OF_MONTH)+
//				  "��"+ca.get(Calendar.HOUR_OF_DAY)+
//				  "��"+ca.get(Calendar.MINUTE)+"��"
//				  +ca.get(Calendar.SECOND)+"��"
//				  );
		  if(this.getRecInfo()!=null) {
			 str+="�ռ���������"+this.getRecInfo().getRecName()
					             +"   �ռ��˵�ַ"+this.getRecInfo().getAddr()+"\n";
		  }
		  double  sumPrice=0;
		  for(Item temp:this.getBuyCart().getItems()) {
			   double price=temp.getProduct().getPrice()*temp.getAmount();
			   sumPrice+=price;
		       str+=temp.getProduct().getName()+" ����:"+temp.getAmount()+
		                          "  �ϼ�"+price+"Ԫ\n";
		  }
		 str+=" �ܼ�:"+sumPrice+"Ԫ\n";
		 return str;
	}
}
