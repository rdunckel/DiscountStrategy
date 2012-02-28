package wctc.advancedjava.lab.DiscountStrategy;

/**
 * The Customer class hold information about the customer making the purchase.
 * 
 * @author Ryan Dunckel
 * 
 */
public class Customer {

	private String customerId;
	private String name;

	public Customer(String customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}

	public final String getCustomerId() {
		return customerId;
	}

	public final void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

}
