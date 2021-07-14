
public class Invoice implements Payable{
	private final String partNumber;
	private int quantity;
	private double pricePerItem;
	public Invoice(String partNumber, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	@Override
	public double getPayableAmount() {
		return quantity*pricePerItem;
	}
	@Override
	public String toString() {
		return String.format("%s Qty: %d, Price %,.2f",
				partNumber,quantity,pricePerItem);
	}
	
}
