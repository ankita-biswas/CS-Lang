package toystore;

import java.util.Date;

public class SalesReceipt {
    private SalesRecord[] records;
    private Double totalPrice;
    private int totalItems;
    private String receiptId;
    private Date sellDate;

    public SalesReceipt() {

    }

    public SalesRecord[] getRecords() {
	return records;
    }

    public void setRecords(SalesRecord[] records) {
	this.records = records;
    }

    public Double getTotalPrice() {
	return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
	this.totalPrice = totalPrice;
    }

    public int getTotalItems() {
	return totalItems;
    }

    public void setTotalItems(int totalItems) {
	this.totalItems = totalItems;
    }

    public String getReceiptId() {
	return receiptId;
    }

    public void setReceiptId(String receiptId) {
	this.receiptId = receiptId;
    }

    public Date getSellDate() {
	return sellDate;
    }

    public void setSellDate(Date sellDate) {
	this.sellDate = sellDate;
    }

}
