package assign_2_Q1;

public class Invoice {
	String partNumber;
	String partDescription;
	int quatityOfItemPurchased;
	double pricePerItem;
		
	public Invoice() {
		this("0", "", 0, 0);
	}
	
	public Invoice(String partNumber, String partDescription, int quatityOfItemPurchased, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quatityOfItemPurchased = quatityOfItemPurchased;
		this.pricePerItem = pricePerItem;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuatityOfItemPurchased() {
		return quatityOfItemPurchased;
	}
	public void setQuatityOfItemPurchased(int quatityOfItemPurchased) {
		if(quatityOfItemPurchased<=0)
			this.quatityOfItemPurchased = 0;
		else
			this.quatityOfItemPurchased = quatityOfItemPurchased;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem<=0)
			this.pricePerItem = 0;
		else
			this.pricePerItem = pricePerItem;
	}
	
	double calculateBill() {
		return quatityOfItemPurchased * pricePerItem;
	}
	


}
