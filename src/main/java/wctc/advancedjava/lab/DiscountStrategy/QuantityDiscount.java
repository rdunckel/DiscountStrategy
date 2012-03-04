package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Discount received after purchasing so many of one item.
 * 
 * @author Ryan Dunckel
 */
public class QuantityDiscount implements DiscountStrategy {

	private static final double PERCENT_DISCOUNT = 0.10;
	private static final double MIN_QUANTITY = 3;
	private static final double NO_DISCOUNT = 0.00;

	public final double calculateDiscount(double unitCost, double quantity) {

		double discount = 0.00;

		if (quantity >= MIN_QUANTITY) {
			discount = unitCost * PERCENT_DISCOUNT * quantity;
		} else {
			discount = NO_DISCOUNT;
		}

		return discount;

	}

	@SuppressWarnings("all")
	public static void main(String[] args) {

		double discount = 0.00;

		QuantityDiscount qtyDiscount = new QuantityDiscount();

		discount = qtyDiscount.calculateDiscount(10, 9);

		System.out.println("Discount = " + discount);

	}
}
