package wctc.advancedjava.lab.DiscountStrategy;


/**
 * Percentage discount off of product.
 * 
 * @author Ryan Dunckel
 */
public class PercentageDiscount implements DiscountStrategy {

    public final double calculateDiscount(double unitCost, double quantity) {

        double discountPercent = 0.20;

        return unitCost * quantity * discountPercent;

    }

    public static void main(String[] args) {

        double discount = 0.00;

        PercentageDiscount percDiscount = new PercentageDiscount();

        discount = percDiscount.calculateDiscount(10, 9);

        System.out.println("Discount = " + discount);

    }
}
