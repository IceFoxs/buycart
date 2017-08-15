package buycart;

public class RecInfo {

	private int id;
	private String addr;
	private String recName;
	
	private boolean isDefault = false;

	public RecInfo() {
	}

	public RecInfo(int id, String addr, String recName , boolean isDefault) {
		this.id = id;
		this.addr = addr;
		this.recName = recName;
		this.isDefault = isDefault;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}
	
	

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "RecInfo [id=" + id + ", addr=" + addr + ", recName=" + recName + ", isDefault=" + isDefault + "]";
	}

	
}
