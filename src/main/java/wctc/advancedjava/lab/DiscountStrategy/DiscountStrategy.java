package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Interface for abstracting the discount details from a product.
 * 
 * @author Ryan Dunckel
 * 
 */
public interface DiscountStrategy {

	public abstract double calculateDiscount(double unitCost, double quantity);

}
