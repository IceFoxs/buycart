package buycart;

public class Test {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Java从入门到精通", 100);
		Product p2 = new Product(2, "iphone 8", 10);
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("tom");
		RecInfo rec1 = new RecInfo(1, "智慧公寓", "保安-jack", true);
		RecInfo rec2 = new RecInfo(1, "neusoft大厦", "保安队长-boss", false);
		RecInfo[] infos = { rec1 , rec2 };	
		c1.setRecInfos(infos);
		Item item01 = new Item(p1 , 2 );
		Item item02 = new Item(p2 , 2 );
		Item item06 = new Item(p1 , 2 );
		Item item03 = new Item(p2 , 6);
		Item item04 = new Item(p2 , 1);
		Item item05 = new Item(p1 , 5 );
		Item[] items = {item01 , item02 ,item06 , item03, item04,item05};
		
		BuyCart cart = new BuyCart();
		cart.setItems(items);
		Item item09 = new Item(p2 , 3);
		Item item07 = new Item(p2 , 3);
		Item item08 = new Item(p1 , 4);
		Item[] item1= {item07,item09,item08};
		cart.addItems(item1);
		//做处理  , 　多余的让其加数量　　　减少项
//	    cart.handler();
//		cart.clearBuyCartRepeat();
		//////////////////////
		//查看购物车
		cart.showBuyCart();
		
		////////////////////
		//生成订单   留给大家.....
		
		
		
	}
	

}
