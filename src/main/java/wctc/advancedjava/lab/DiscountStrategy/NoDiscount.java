package wctc.advancedjava.lab.DiscountStrategy;

/**
 * No discount at all.
 * 
 * @author Ryan Dunckel
 */
public class NoDiscount implements DiscountStrategy {

	public final double calculateDiscount(double unitCost, double quantity) {

		return 0.0;

	}

	public static void main(String[] args) {

		double discount = 0.00;

		NoDiscount noDiscount = new NoDiscount();

		discount = noDiscount.calculateDiscount(10, 9);

		System.out.println("Discount = " + discount);

	}
}
