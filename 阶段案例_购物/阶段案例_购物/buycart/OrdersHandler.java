package buycart;
import java.util.Date;
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
}
