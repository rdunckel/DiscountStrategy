package wctc.advancedjava.lab.DiscountStrategy;


/**
 * Buy one get one free discount.
 * 
 * @author Ryan Dunckel
 */
public class BuyOneGetOneDiscount implements DiscountStrategy {

    public final double calculateDiscount(double unitCost, double quantity) {

        double discount = 0.00;

        if (quantity % 2 == 0) {
            discount = unitCost * (quantity / 2);
        } else {
            discount = unitCost * ((quantity - 1) / 2);
        }

        return discount;

    }

    @SuppressWarnings("all")
    public static void main(String[] args) {

        double discount = 0.00;

        BuyOneGetOneDiscount bogoDiscount = new BuyOneGetOneDiscount();

        discount = bogoDiscount.calculateDiscount(10, 9);

        System.out.println("Discount = " + discount);

    }

}
