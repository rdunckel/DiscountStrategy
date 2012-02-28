package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Discount received after purchasing so many of one item.
 * 
 * @author Ryan Dunckel
 */
public class QuantityDiscount implements DiscountStrategy {

	public final double calculateDiscount(double unitCost, double quantity) {

		double discountPercent = 0.10;
		double discount = 0.00;

		if (quantity > 2) {
			discount = unitCost * discountPercent * quantity;
		} else {
			discount = 0.00;
		}

		return discount;

	}

	public static void main(String[] args) {

		double discount = 0.00;

		QuantityDiscount qtyDiscount = new QuantityDiscount();

		discount = qtyDiscount.calculateDiscount(10, 9);

		System.out.println("Discount = " + discount);

	}
}
