package wctc.advancedjava.lab.DiscountStrategy;

import wctc.advancedjava.lab.DiscountStrategy.DiscountStrategyFactory.DiscountStrategies;

/**
 * Factory to create DiscountStrategy objects *
 * 
 * @author Ryan Dunckel
 */
public class ProductFactory {

	private static ProductFactory instance;

	public static enum Products {
		SHOES, SHIRT, PANTS, KITCHEN_APPLIANCE, BELT
	}

	// private static Product[] productList = new Product[5]; // NOSONAR

	// Private constructor for Singleton.
	private ProductFactory() {

	}

	/**
	 * Get instance of the factory to use for building objects.
	 * 
	 * @return
	 */
	public static ProductFactory getInstance() {

		if (instance == null) {
			instance = new ProductFactory();
		}
		return instance;

	}

	public Product createProduct(Products productType) {

		Product product = null;

		switch (productType) {
		case SHOES:
			product = new Shoes("A101");
			break;
		case SHIRT:
			product = new Shirt("B201");
			break;
		case PANTS:
			product = new Pants("C301");
			break;
		case KITCHEN_APPLIANCE:
			product = new KitchenAppliance("D401");
			break;
		case BELT:
			product = new Belt("E501");
			break;
		}

		return product;
	}

	// static {
	//
	// DiscountStrategyFactory discountFactory = DiscountStrategyFactory
	// .getInstance();
	//
	// // NoDiscount
	// // BuyOneGetOneDiscount
	// // QuantityDiscount
	// // FlatDiscount
	// // PercentageDiscount
	// productList[0] = new Product("A102");
	// productList[0].setDescription("Black Shoes");
	// productList[0].setUnitCost(61.99);
	// productList[0].setDiscountStrategy(discountFactory
	// .createDiscountStrategy(DiscountStrategies.NO));
	// productList[1] = new Product("B214");
	// productList[1].setDescription("Small Shirt");
	// productList[1].setUnitCost(39.99);
	// productList[1].setDiscountStrategy(discountFactory
	// .createDiscountStrategy(DiscountStrategies.BUY_ONE_GET_ONE));
	// productList[2] = new Product("C158");
	// productList[2].setDescription("Khaki Pants");
	// productList[2].setUnitCost(53.60);
	// productList[2].setDiscountStrategy(discountFactory
	// .createDiscountStrategy(DiscountStrategies.QUANTITY));
	// productList[3] = new Product("D489");
	// productList[3].setDescription("Pyrex Bowl");
	// productList[3].setUnitCost(10.99);
	// productList[3].setDiscountStrategy(discountFactory
	// .createDiscountStrategy(DiscountStrategies.FLAT));
	// productList[4] = new Product("E567");
	// productList[4].setDescription("Stand Mixer");
	// productList[4].setUnitCost(162.99);
	// productList[4].setDiscountStrategy(discountFactory
	// .createDiscountStrategy(DiscountStrategies.PERCENTAGE));
	// }

	public static final Product findProduct(String productId) {

		Product prod = null;

		// for (Product product : productList) {
		// if ((productId).equals(product.getProductId())) {
		// prod = product;
		// break;
		// }
		// }

		return prod;

	}
}
