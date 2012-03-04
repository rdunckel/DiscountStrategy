package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Percentage discount off of product.
 * 
 * @author Ryan Dunckel
 */
public class PercentageDiscount implements DiscountStrategy {

	private static double PERCENT_DISCOUNT = 0.20;

	public final double calculateDiscount(double unitCost, double quantity) {

		double discountPercent = PERCENT_DISCOUNT;

		return unitCost * quantity * discountPercent;

	}

	public static void main(String[] args) {

		double discount = 0.00;

		PercentageDiscount percDiscount = new PercentageDiscount();

		discount = percDiscount.calculateDiscount(10, 9);

		System.out.println("Discount = " + discount);

	}
}
