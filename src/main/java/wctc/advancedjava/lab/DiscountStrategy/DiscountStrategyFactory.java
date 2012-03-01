package wctc.advancedjava.lab.DiscountStrategy;

/**
 * Factory to create DiscountStrategy objects.
 *
 * @author Ryan Dunckel
 */
public class DiscountStrategyFactory {

    private DiscountStrategyFactory instance;

    private DiscountStrategyFactory() {
    }

    public DiscountStrategyFactory getInstance() {

        if (instance == null) {
            instance = new DiscountStrategyFactory();
        }
        return instance;


    }
}
