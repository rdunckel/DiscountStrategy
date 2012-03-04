package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Pseudo database for holding Customer records.
 * 
 * @author Ryan Dunckel
 */
@SuppressWarnings("all")
public class CustomerDb {

	private static Customer[] customerList = new Customer[4];

	// Private constructor for utility class.
	private CustomerDb() {

	}

	static {
		customerList[0] = new Customer("1123", "Natalie Dunckel");
		customerList[1] = new Customer("2145", "Ryan Dunckel");
		customerList[2] = new Customer("3325", "Moose Dunckel");
		customerList[3] = new Customer("4489", "Bailey Dunckel");
	}

	public static final Customer findCustomer(String customerId) {

		Customer cust = null;

		for (Customer customer : customerList) {
			if ((customerId).equals(customer.getCustomerId())) {
				cust = customer;
				break;
			}
		}

		return cust;

	}
}
