/**Mar 3, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

/**
 * @author jkirkish
 *
 */
public class Product {

	private static double[] prices = { 0.50, 0.65, 0.34, 0.35, 0.66, 2.25, 0.55, 1.67, 3.24, 1.10, 5.04, 7.35, 4.45,
			7.45, 5.95 };
	private static int[] itemList = new int[16];// arrays for placeholders to list the number associated with grocery
												// itme
	private static String[] item = { "Apples", "Oranges", "Bananas", "Onions", "Pickles", "Pears", "Broccoli",
			"Carrots", "Asparagus", "Peaches", "Green Beans", "Watermelon", "Pistachios", "Grapefruit", "Avocados" };// list
																														// //
																														// of
	private String name;
	private double price; // items.
	private int index;

	public Product(String name1, double price) {
		this.name = name;
		this.price = price;
	}

	public static String getProductName(int value) {
		String result = null;
		if (value >= 1 && value <= 15) {
			result = item[value - 1];
		}
		return result;
	}

	/*
	 * @return the price
	 */
	public static double getPrice(int value) {
		double result = 0.0;
		if (value >= 1 && value <= 15) {
			result = prices[value - 1];
		}
		return result;
	}

	/**
	 * @param price
	 *            the price to set
	 */

	public void displayGroceryList() {

		System.out.printf("%s%30s\n", "ITEM", "PRICE");
		for (int i = 0; i < item.length; i++) {
			itemList[i] = i + 1;
			System.out.printf("%d.%s-------------------->$%s\n", itemList[i], item[i], prices[i]);
		}
	}

	public String toString() {

		return name + ":" + price;

	}
}
