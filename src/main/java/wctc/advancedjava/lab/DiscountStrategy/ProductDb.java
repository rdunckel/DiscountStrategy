package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Pseudo database for holding Product records.
 * 
 * @author Ryan Dunckel
 */
// NOSONAR
public class ProductDb {

	private static Product[] productList = new Product[5];

	// Private constructor for utility class.
	private ProductDb() {

	}

	static {
		// NoDiscount
		// BuyOneGetOneDiscount
		// QuantityDiscount
		// FlatDiscount
		// PercentageDiscount
		productList[0] = new Product("A102");
		productList[0].setDescription("Black Shoes");
		productList[0].setUnitCost(61.99);
		productList[0].setDiscountStrategy(new NoDiscount());
		productList[1] = new Product("B214");
		productList[1].setDescription("Small Shirt");
		productList[1].setUnitCost(39.99);
		productList[1].setDiscountStrategy(new BuyOneGetOneDiscount());
		productList[2] = new Product("C158");
		productList[2].setDescription("Khaki Pants");
		productList[2].setUnitCost(53.60);
		productList[2].setDiscountStrategy(new QuantityDiscount());
		productList[3] = new Product("D489");
		productList[3].setDescription("Pyrex Bowl");
		productList[3].setUnitCost(10.99);
		productList[3].setDiscountStrategy(new FlatDiscount());
		productList[4] = new Product("E567");
		productList[4].setDescription("Stand Mixer");
		productList[4].setUnitCost(162.99);
		productList[4].setDiscountStrategy(new PercentageDiscount());
	}

	public static final Product findProduct(String productId) {

		Product prod = null;

		for (Product product : productList) {
			if ((productId).equals(product.getProductId())) {
				prod = product;
				break;
			}
		}

		return prod;

	}
}
