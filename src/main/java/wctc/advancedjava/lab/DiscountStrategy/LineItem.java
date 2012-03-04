package wctc.advancedjava.lab.DiscountStrategy;

/**
 * The LineItem class does the work of gathering product information from the
 * product, and input information regarding the transcation in order to store
 * information about the cost, discount, etc.
 * 
 * @see Product
 * @author Ryan Dunckel
 * 
 */
public class LineItem {

	private Product product;
	private double quantity;
	private double discount;
	private double subTotal;

	public LineItem(String productId, double quantity) {
		product = ProductDb.findProduct(productId);
		setQuantity(quantity);
		setDiscount(calculateDiscount());
		setSubTotal(calculateSubTotal());
	}

	public Product getProduct() {
		return product;
	}

	public final void setProduct(Product product) {
		this.product = product;
	}

	public final double getQuantity() {
		return quantity;
	}

	public final void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	private double calculateDiscount() {

		double unitCost = product.getUnitCost();

		return product.getDiscountStrategy().calculateDiscount(unitCost,
				quantity);
	}

	private double calculateSubTotal() {

		double unitCost = product.getUnitCost();

		return unitCost * quantity - discount;

	}

	public final double getDiscount() {
		return discount;
	}

	public final void setDiscount(double discount) {
		this.discount = discount;
	}

	public final double getSubTotal() {
		return subTotal;
	}

	public final void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

}
