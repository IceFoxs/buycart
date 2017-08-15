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
//				//�ü�����
//				items = ArrayUtils.subarray(items, 0, items.length-1);
//			}
//		}
//	}
	private void  handler(){
		//�ȼ�����ظ�Ԫ�صĸ�ʽ:
		int count = 0; //��¼�ظ�Ԫ�صĸ���
		for(int i = 0 ; i < items.length-1 ; i++){
			for(int j = i+1 ; j<items.length ; j++){
				if(items[i].equals(items[j])){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		//������ �ĳ���
		int newLength = items.length - count;
		//����һ���µ�����
		 Item[] newArr = new  Item[newLength];
		int index = 0 ; 	//�����������ֵ
        
		//����������
		for(int i = 0  ; i< items.length ; i++){
			Item temp = items[i];  //�������е�Ԫ�� 
			boolean flag = false;  //Ĭ�ϲ����ظ�Ԫ��
			//���ž����� ��Ԫ�� ���������ÿ��Ԫ�رȽ�һ�Ρ�
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
