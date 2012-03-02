package wctc.advancedjava.lab.DiscountStrategy;


/**
 * Interface to define behavior for formatting output.
 * 
 * @author Ryan Dunckel
 */
public interface ReceiptFormatStrategy {

    public abstract String formatOutput(Receipt receipt);

}
