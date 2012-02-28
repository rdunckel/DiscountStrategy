package wctc.advancedjava.lab.util;

import wctc.advancedjava.lab.DiscountStrategy.LineItem;

/**
 * Utility class for resizing arrays (versus using Lists).
 */
public class ResizeArray {

	/**
	 * Here's a method that encapsulates the logic for adding an item
	 * 
	 * @param item
	 */
	public static LineItem[] addItem(LineItem[] array, LineItem item) {
		LineItem[] temp = new LineItem[array.length + 1];
		System.arraycopy(array, 0, temp, 0, array.length);
		temp[temp.length - 1] = item;
		return temp;
	}

	/**
	 * Here's a method that encapsulates the logic for removing an item
	 * 
	 * @param item
	 */
	public static LineItem[] removeItem(LineItem[] array, LineItem item) {
		LineItem[] temp = new LineItem[array.length - 1];

		for (int i = 0, j = 0; j < array.length; i++, j++) {
			// if (array[j].equalsIgnoreCase(item)) {
			// Changing to be more generic since its no longer just for Strings
			if (array[j] == item) {
				// skip it, but decrement the counter first
				--i;
			} else {
				// copy it
				temp[i] = array[j];
			}
		}

		return temp;
	}
}
