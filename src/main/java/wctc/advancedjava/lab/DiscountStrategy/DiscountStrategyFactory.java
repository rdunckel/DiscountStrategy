package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Factory to create DiscountStrategy objects.
 * 
 * @author Ryan Dunckel
 */
public class DiscountStrategyFactory {

	private static DiscountStrategyFactory instance;

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
}
