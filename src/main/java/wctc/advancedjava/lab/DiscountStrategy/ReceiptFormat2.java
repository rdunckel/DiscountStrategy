package wctc.advancedjava.lab.DiscountStrategy;

import java.text.NumberFormat;
import wctc.advancedjava.lab.util.StringFormat;

/**
 * Formats receipt output (format 2) for a purchase.
 * 
 * @see StringFormat
 * @author Ryan Dunckel
 * 
 */
public class ReceiptFormat2 implements ReceiptFormatStrategy {

	private StringBuilder stringBuilder = new StringBuilder();

	public final String formatOutput(Receipt receipt) {

		addLineItem("Product ID", "Description", "Unit Cost", "Quantity",
				"Discount", "Sub-Total");
		stringBuilder.append("\n");
		addLineItem("**********", "***********", "*********", "********",
				"********", "***********");
		stringBuilder.append("\n");

		for (LineItem item : receipt.getLineItems()) {
			String productId = item.getProduct().getProductId();
			String description = item.getProduct().getDescription();

			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
			NumberFormat numberFormatter = NumberFormat.getNumberInstance();

			String unitCost = currencyFormatter.format(item.getProduct()
					.getUnitCost());
			String quantity = numberFormatter.format(item.getQuantity());
			String discount = currencyFormatter.format(item.getDiscount());
			String subTotal = currencyFormatter.format(item.getSubTotal());

			addLineItem(productId, description, unitCost, quantity, discount,
					subTotal);

			stringBuilder.append("\n");
		}

		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		String grandTotal = currencyFormatter.format(receipt.getSaleTotal());

		stringBuilder.append("\n");
		stringBuilder.append("\n");
		addLineItem("", "", "", "", "", "Grand Total");
		stringBuilder.append("\n");
		addLineItem("", "", "", "", "", "***********");
		stringBuilder.append("\n");
		addLineItem("", "", "", "", "", grandTotal);

		return stringBuilder.toString();

	}

	private final void addLineItem(String productId, String description,
			String unitCost, String quantity, String discount, String subTotal) {

		stringBuilder.append(StringFormat.padRight(productId, 14));
		stringBuilder.append(StringFormat.padRight(description, 25));
		stringBuilder.append(StringFormat.padLeft(unitCost, 13));
		stringBuilder.append(StringFormat.padLeft(quantity, 12));
		stringBuilder.append(StringFormat.padLeft(discount, 12));
		stringBuilder.append(StringFormat.padLeft(subTotal, 15));

	}

}
