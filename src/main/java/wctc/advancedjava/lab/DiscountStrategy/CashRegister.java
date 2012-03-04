package wctc.advancedjava.lab.DiscountStrategy;

/**
 * The CashRegister class manages the customer transactions, but is simply an
 * input/output device.
 * 
 * @see Receipt
 * @see ReceiptFormatStrategy
 * @author Ryan Dunckel
 */
public class CashRegister {

	private Receipt receipt;
	private ReceiptFormatStrategy receiptFormatStrategy;

	public ReceiptFormatStrategy getReceiptFormatStrategy() {
		return receiptFormatStrategy;
	}

	public void setReceiptFormatStrategy(
			ReceiptFormatStrategy receiptFormatStrategy) {
		this.receiptFormatStrategy = receiptFormatStrategy;
	}

	public final void startNewSale(String customerId) {
		this.receipt = new Receipt(customerId);

	}

	public final void addProduct(String productId, double quantity) {
		if (receipt == null) {
			throw new IllegalArgumentException("Receipt object not initialized");
		}

		receipt.addProduct(productId, quantity);
	}

	public final void finalizeSale() {
		printReceipt();
	}

	public final void printReceipt() {

		receiptFormatStrategy = new ReceiptFormat1();
		System.out.println(receiptFormatStrategy.formatOutput(receipt)); //NOSONAR

	}

}
