package buycart;

public class Item {

	private Product product;
	private int amount;

	public Item(Product product, int amount) {
		this.product = product;
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [product=" + product + ", amount=" + amount + "]";
	}

	// 判断两个产品是否一样
	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		Item item01 = this;
		Item item02 = (Item) obj;
		if (item01.getProduct().getId() == item02.getProduct().getId()) {
			return true;
		} else {
			return false;
		}
		
	}

}
