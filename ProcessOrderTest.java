/**Mar 6, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author jkirkish
 *
 */
public class ProcessOrderTest {

	private static Product merchand = new Product("Empty", 0.00);
	private static int groceryItem; // item number on the list of Groceries
	private static int quantity;// how many items altogether they want
	private static Scanner choice = new Scanner(System.in);
	private static Scanner howMany = new Scanner(System.in);
	private static double price, itemCost;
	private static Invoice invoice = new Invoice();
    
	
	public static void main(String[] args) {
		System.out.println("******ONLINE GROCERY SELECTION*******");
		System.out.print("________________________________\n\n\n");
		merchand.displayGroceryList();
		selectGroceryItem();
		
	}

	public static void selectGroceryItem() {// Scanner Object
		groceryItem = 0;
		int iteration = 0;
		while (groceryItem != -1) {
			// prompt for input again
			if(iteration == 0) {
			System.out.print("Enter the Grocery item choice you want between 1 thru 15 on the list or -1 to quit: ");
			groceryItem = choice.nextInt();
			promptUser(groceryItem);
			}
			else if (iteration >= 1) {
				System.out.print(
						"Enter the next Grocery item choice you want between 1 thru 15 on the list or -1 to quit: ");
				groceryItem = choice.nextInt();
				promptUser(groceryItem);
			}

			iteration++;
		}
	}

	public static void promptUser(int value) {
		price = merchand.getPrice(value);
		if (value >= 1 && value <= 15) {
			System.out.println("How many of those items do you want?  ");
		} else if (value < -1 || value > 15) {
			System.err.print("You didn't enter a number between 1 and 15.Please try again!");
			selectGroceryItem();

		} else {
			System.out.println("NICE DOING BUSINESS WITH YOU.  PLEASE COME BACK AGAIN! BYE BYE :)!");
			displayReciept();
			System.exit(0);
		}
		quantity = howMany.nextInt();
		itemCost = (quantity * price);
		System.out.println("You selected: Item " + groceryItem + "[ quantity " + quantity + "] ["
				+ merchand.getProductName(groceryItem) + "] [Total Cost: $" + itemCost + "]");
		
		invoice.addTheItem(value,quantity, itemCost);
		
	}
	public static void displayReciept()
	{
		invoice.occurrences();
		invoice.displayInvoice();
	}
}
