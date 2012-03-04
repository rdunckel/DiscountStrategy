package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Flat rate discount if total purchase is over a certain dollar amount.
 * 
 * @author Ryan Dunckel
 */
public class FlatDiscount implements DiscountStrategy {

	private static final double FLAT_DISCOUNT = 5.00;
	private static final double NO_DISCOUNT = 0.00;

	public final double calculateDiscount(double unitCost, double quantity) {

		double discount = 0.00;
		double grossTotal = unitCost * quantity;

		if (grossTotal > FLAT_DISCOUNT) {
			discount = FLAT_DISCOUNT;
		} else {
			discount = NO_DISCOUNT;
		}

		return discount;

	}

	@SuppressWarnings("all")
	public static void main(String[] args) {

		double discount = 0.00;

		FlatDiscount flatDiscount = new FlatDiscount();

		discount = flatDiscount.calculateDiscount(10, 9);

		System.out.println("Discount = " + discount);

	}

}
