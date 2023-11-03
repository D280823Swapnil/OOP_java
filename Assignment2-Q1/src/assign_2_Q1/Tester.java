package assign_2_Q1;

public class Tester {
	public static void main(String[] args) {
		Invoice i = new Invoice("1","Nut",10,5);
		
		System.out.println(
				"Part Number " + i.getPartNumber() + "\n"
				+ "Part Description " + i.getPartDescription() + "\n"
				+ "Quatity Of Item Purchased " + i.getQuatityOfItemPurchased() + "\n"
				+ "Price Per Item " + i.getPricePerItem() + "\n"
				+ "");
		
		System.out.println("Invoice Bill "+ i.calculateBill());
		
		// set quatity to -5.
		i.setQuatityOfItemPurchased(-5);
		System.out.println("Quatity Of Item Purchased =" + i.getQuatityOfItemPurchased());
		
		//set price per item to -9.
		i.setPricePerItem(-9);
		System.out.println("Price Per Item "+ i.getPricePerItem());
		
		System.out.println("Invoice Bill "+ i.calculateBill());
		
		
	}


}
