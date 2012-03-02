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
        if (description.length() > 25) {
            throw new IllegalArgumentException(
                    "Description must be less than or equal to 25 characters");
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
