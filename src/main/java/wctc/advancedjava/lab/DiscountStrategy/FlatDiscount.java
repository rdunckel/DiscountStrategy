package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Flat rate discount if total purchase is over a certain dollar amount.
 * 
 * @author Ryan Dunckel
 */
public class FlatDiscount implements DiscountStrategy {

	public final double calculateDiscount(double unitCost, double quantity) {

		double discount = 0.00;
		double grossTotal = unitCost * quantity;

		if (grossTotal > 5) {
			discount = 5.00;
		} else {
			discount = 0.00;
		}

		return discount;

	}

	public static void main(String[] args) {

		double discount = 0.00;

		FlatDiscount flatDiscount = new FlatDiscount();

		discount = flatDiscount.calculateDiscount(10, 9);

		System.out.println("Discount = " + discount);

	}

}
