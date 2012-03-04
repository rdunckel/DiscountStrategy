package wctc.advancedjava.lab.DiscountStrategy;

/**
 * The Startup class provides all the input for the Point-of-Sale program
 * demonstrating the (Discount) Strategy pattern.
 * 
 * @see CashRegister
 * @author Ryan Dunckel
 */
public final class Startup {

	// Private constructor for Startup class.
	private Startup() {

	}

	public static void main(String[] args) {

		CashRegister cashRegister = new CashRegister();

		// 1123 - Natalie Dunckel
		// 2145 - Ryan Dunckel
		// 3325 - Moose Dunckel
		// 4489 - Bailey Dunckel
		cashRegister.startNewSale("1123");

		// A102 - Black Shoes
		// B214 - Small Shirt
		// C158 - Khaki Pants
		// D489 - Pyrex Bowl
		// E567 - Stand Mixer
		cashRegister.addProduct("A102", 1); // NOSONAR
		cashRegister.addProduct("B214", 2); // NOSONAR
		cashRegister.addProduct("C158", 3); // NOSONAR
		cashRegister.addProduct("D489", 14); // NOSONAR
		cashRegister.addProduct("E567", 1); // NOSONAR

		cashRegister.finalizeSale();

	}
}
