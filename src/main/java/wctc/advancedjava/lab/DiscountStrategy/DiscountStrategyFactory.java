package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Factory to create DiscountStrategy objects.
 * 
 * @author Ryan Dunckel
 */
public class DiscountStrategyFactory {

	private static DiscountStrategyFactory instance;

	public static enum DiscountStrategies {
		BUY_ONE_GET_ONE, FLAT, NO, PERCENTAGE, QUANTITY
	}

	// Private constructor for Singleton.
	private DiscountStrategyFactory() {
	}

	/**
	 * Get instance of the factory to use for building objects.
	 * 
	 * @return
	 */
	public static DiscountStrategyFactory getInstance() {

		if (instance == null) {
			instance = new DiscountStrategyFactory();
		}
		return instance;

	}

	public DiscountStrategy createDiscountStrategy(
			DiscountStrategies strategyType) {

		DiscountStrategy discountStrategy = null;

		switch (strategyType) {
		case BUY_ONE_GET_ONE:
			discountStrategy = new BuyOneGetOneDiscount();
			break;
		case FLAT:
			discountStrategy = new FlatDiscount();
			break;
		case NO:
			discountStrategy = new NoDiscount();
			break;
		case PERCENTAGE:
			discountStrategy = new PercentageDiscount();
			break;
		case QUANTITY:
			discountStrategy = new QuantityDiscount();
			break;
		}

		return discountStrategy;
	}
}
