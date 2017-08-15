package buycart;

import java.util.Arrays;

public class Customer {
	
	private int id;
	private String name;
	
	private RecInfo[] recInfos;
	

	public Customer() {
		
	}

	public Customer(int id, String name, RecInfo[] recInfos) {
		
		this.id = id;
		this.name = name;
		this.recInfos = recInfos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RecInfo[] getRecInfos() {
		return recInfos;
	}

	public void setRecInfos(RecInfo[] recInfos) {
		this.recInfos = recInfos;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", recInfos=" + Arrays.toString(recInfos) + "]";
	}
	
	
	

}
