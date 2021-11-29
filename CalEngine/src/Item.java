
public class Item {

	public String SKUId;
	public long price;
	
	
	
	public Item(String sKUId) {
		super();
		SKUId = sKUId;
	}
	public String getSKUId() {
		return SKUId;
	}
	public void setSKUId(String sKUId) {
		SKUId = sKUId;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
}
