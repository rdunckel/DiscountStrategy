package wctc.advancedjava.lab.DiscountStrategy;

/**
 * The Product class holds information about each product and its associated
 * Discount strategy.
 * 
 * @see DiscountStrategy
 * @author Ryan Dunckel
 * 
 */
public class Product {

	private String productId;
	private String description;
	private double unitCost;
	private DiscountStrategy discountStrategy;
	private static final int MAX_LENGTH = 25;

	public Product(String productId) {
		this.productId = productId;
	}

	public final String getProductId() {
		return productId;
	}

	public final void setProductId(String productId) {
		this.productId = productId;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		if (description.length() > MAX_LENGTH) {
			throw new IllegalArgumentException(
					"Description must be less than or equal to " + MAX_LENGTH
							+ " characters");
		}
		this.description = description;
	}

	public final double getUnitCost() {
		return unitCost;
	}

	public final void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	public final DiscountStrategy getDiscountStrategy() {
		return discountStrategy;
	}

	public final void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}

}
