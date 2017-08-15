package buycart;

import org.apache.commons.lang3.ArrayUtils;

public class BuyCart {

	private Item[] items; 

	public Item[] getItems() {
		return items;
	}
	
	public void setItems(Item[] items) {
		this.items = items;
		handler();
		}

	//
//	public void handler() {
//		for (int i = 0; i < items.length-1; i++) {
//			if(items[i].equals(items[i+1])) {
//				items[i].setAmount(items[i].getAmount()+items[i+1].getAmount()); // 6+1
//				items[i+1] = null;
//				//裁剪数组
//				items = ArrayUtils.subarray(items, 0, items.length-1);
//			}
//		}
//	}
	private void  handler(){
		//先计算出重复元素的格式:
		int count = 0; //记录重复元素的个数
		for(int i = 0 ; i < items.length-1 ; i++){
			for(int j = i+1 ; j<items.length ; j++){
				if(items[i].equals(items[j])){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		//新数组 的长度
		int newLength = items.length - count;
		//创建一个新的数组
		 Item[] newArr = new  Item[newLength];
		int index = 0 ; 	//新数组的索引值
        
		//遍历旧数组
		for(int i = 0  ; i< items.length ; i++){
			Item temp = items[i];  //旧数组中的元素 
			boolean flag = false;  //默认不是重复元素
			//拿着旧数组 的元素 与新数组的每个元素比较一次。
			for(int j = 0 ; j< newArr.length ; j++){
				if(temp.equals(newArr[j])){
					items[j].setAmount(temp.getAmount()+items[j].getAmount());
					flag = true;
					break;
				}
			}
			if(flag == false){
				newArr[index++] = temp;	
			}
		}
		items=newArr;
	}
	public void showBuyCart() {

		for (Item item : items) {
			System.out.println(item);
		}

	}

}
