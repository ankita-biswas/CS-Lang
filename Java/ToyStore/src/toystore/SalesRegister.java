package toystore;

import java.util.Date;

public class SalesRegister {

    // Prepare inventory
    public Product[] prepareInventory() {
	Product p1 = new Product();
	p1.setAgeCategory(Product.AgeCategory.Baby);
	p1.setName("Elmo");
	p1.setSku("5001");
	p1.setPrice(8.90);

	Product p2 = new Product();
	p2.setAgeCategory(Product.AgeCategory.Toddler);
	p2.setName("Blocks");
	p2.setSku("8016");
	p2.setPrice(4.99);

	Product p3 = new Product();
	p3.setAgeCategory(Product.AgeCategory.Kids);
	p3.setName("Barbie");
	p3.setSku("7394");
	p3.setPrice(13.00);

	Product p4 = new Product();
	p4.setAgeCategory(Product.AgeCategory.Teen);
	p4.setName("Photo Frame");
	p4.setSku("3846");
	p4.setPrice(3.85);

	Product products[] = { p1, p2, p3, p4 };
	return products;
    }

    // Customer picks items
    public SalesRecord[] pickItems(Product[] inventory) {

	SalesRecord sr1 = new SalesRecord();
	sr1.setItem(inventory[1]);
	sr1.setQuantity(3);

	SalesRecord sr2 = new SalesRecord();
	sr2.setItem(inventory[2]);
	sr2.setQuantity(2);

	SalesRecord salesRecords[] = { sr1, sr2 };
	return salesRecords;
    }

    // Cashier/Employee prints sales receipt for payment
    public SalesReceipt prepareReceipt(SalesRecord[] salesRecords) {
	SalesReceipt sr = new SalesReceipt();
	sr.setReceiptId("K-3430-3437");
	sr.setSellDate(new Date());
	sr.setRecords(salesRecords);

	int totalItems = 0;
	double totalPrice = 0.0;
	for (int i = 0; i < salesRecords.length; i++) {
	    totalItems = totalItems + salesRecords[i].getQuantity();
	    totalPrice = totalPrice + salesRecords[i].getQuantity() * salesRecords[i].getItem().getPrice();
	}
	sr.setTotalItems(totalItems);
	sr.setTotalPrice(totalPrice);

	return sr;
    }

    public void printReceipt(SalesReceipt sr) {

	System.out.println("Welcome to Khilona Bazar!!!");
	System.out.println("Receipt ID: " + sr.getReceiptId());
	System.out.println("Receipt date: " + sr.getSellDate());

	System.out.println("Item Name  Quantity  Price");
	SalesRecord[] records = sr.getRecords();
	for (int i = 0; i < records.length; i++) {
	    Product item = records[i].getItem();
	    System.out.println(item.getName() + "@" + item.getPrice() + "       " + records[i].getQuantity() + " "
		    + item.getPrice() * records[i].getQuantity());
	}

	System.out.println("Total items: " + sr.getTotalItems());
	System.out.println("Total price: " + sr.getTotalPrice());

    }

    public static void main(String[] args) {

	SalesRegister sr = new SalesRegister();

	Product[] products = sr.prepareInventory();

	SalesRecord[] salesRecords = sr.pickItems(products);

	SalesReceipt receipt = sr.prepareReceipt(salesRecords);

	sr.printReceipt(receipt);

    }

}
