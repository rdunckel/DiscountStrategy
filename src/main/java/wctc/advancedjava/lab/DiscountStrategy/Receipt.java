package wctc.advancedjava.lab.DiscountStrategy;

import java.util.Arrays;
import wctc.advancedjava.lab.util.ResizeArray;

/**
 * The Receipt class hold the "invoice" information about the sale, but is more
 * like the container for which all the sale/transactional information sits in.
 * 
 * @see LineItem
 * @see Customer
 * @see ResizeArray
 * @author Ryan Dunckel
 * 
 */
public class Receipt {

	private LineItem[] lineItems;
	private Customer customer;
	private double saleTotal;

	public Receipt(String customerId) {
		Customer cust = CustomerDb.findCustomer(customerId);

		setCustomer(cust);
		lineItems = new LineItem[0];
	}

	public final LineItem[] getLineItems() {
		return lineItems;
	}

	public final void setLineItems(LineItem[] lineItems) {
		this.lineItems = Arrays.copyOf(lineItems, lineItems.length);
	}

	public final Customer getCustomer() {
		return customer;
	}

	public final void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public final double getSaleTotal() {
		return saleTotal;
	}

	/**
	 * Can also be used to manually over-ride sale (with manager's permission).
	 * 
	 * @param saleTotal
	 */
	public final void setSaleTotal(double saleTotal) {
		this.saleTotal = saleTotal;
	}

	/**
	 * Reset sale total in the event an error was made (i.e. via manual
	 * over-rides).
	 */
	public final void resetSaleTotal() {

		double total = 0.0;

		for (LineItem lineItem : lineItems) {
			total += lineItem.getSubTotal();
		}

		setSaleTotal(total);

	}

	public final void addProduct(String productId, double quantity) {
		LineItem lineItem = new LineItem(productId, quantity);

		setLineItems((LineItem[]) ResizeArray.addItem(lineItems, lineItem));
		setSaleTotal(getSaleTotal() + lineItem.getSubTotal());
	}

}
