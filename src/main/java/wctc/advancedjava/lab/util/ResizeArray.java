package wctc.advancedjava.lab.util;

/**
 * Utility class for resizing arrays (versus using Lists).
 */
public final class ResizeArray {

	// Private constructor for utility class.
	private ResizeArray() {

	}

	/**
	 * Here's a method that encapsulates the logic for adding an item
	 * 
	 * @param item
	 */
	public static Object addItem(Object[] array, Object item) {
		Object[] temp = new Object[array.length + 1];

		System.arraycopy(array, 0, temp, 0, array.length);
		temp[temp.length - 1] = item;
		return temp;
	}

	/**
	 * Here's a method that encapsulates the logic for removing an item
	 * 
	 * @param item
	 */
	public static Object removeItem(Object[] array, Object item) {
		Object[] temp = new Object[array.length - 1];

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
