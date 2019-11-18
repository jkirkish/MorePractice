/**Mar 6, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jkirkish
 *
 */
public class Invoice {

	ArrayList<Double> quantityCostArray = new ArrayList<Double>();
	ArrayList<String> cart = new ArrayList<String>();
	ArrayList<Integer> quantityValues = new ArrayList<Integer>();

	// add the item to the product
	public void addTheItem(int value,int quantity, double quantityCost) {

		// determine which grocery item to add
		switch (value) {

		case 1:
			cart.add("Apples");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 2:
			cart.add("Oranges");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 3:
			cart.add("Bananas");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 4:
			cart.add("Onions");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 5:
			cart.add("Pickles");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 6:
			cart.add("Pears");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 7:
			cart.add("Broccoli");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 8:
			cart.add("Carrots");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 9:
			cart.add("Asparagus");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 10:
			cart.add("Peaches");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 11:
			cart.add("Green Beans");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 12:
			cart.add("Watermelon");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 13:
			cart.add("Pistachio");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 14:
			cart.add("Grapefruit");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		case 15:
			cart.add("Avocados");
			quantityCostArray.add(quantityCost);
			quantityValues.add(quantity);
			break;
		}

	}

	// remove the item from the product
	public void removetheItem(int value,int quantity, double quantityCost) {
		// determine which grocery item to add
		switch (value) {

		case 1:
			cart.remove("Apples");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 2:
			cart.remove("Oranges");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 3:
			cart.remove("Bananas");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 4:
			cart.remove("Onions");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 5:
			cart.remove("Pickles");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 6:
			cart.remove("Pears");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 7:
			cart.remove("Broccoli");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 8:
			cart.remove("Carrots");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 9:
			cart.remove("Asparagus");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 10:
			cart.remove("Peaches");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 11:
			cart.remove("Green Beans");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 12:
			cart.remove("Watermelon");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 13:
			cart.remove("Pistachio");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 14:
			cart.remove("Grapefruit");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		case 15:
			cart.remove("Avocados");
			quantityCostArray.remove(quantityCost);
			quantityValues.remove(quantity);
			break;
		}

	}

	// clear the list of items
	public void clearInvoice() {
		cart.clear();
	}

	public void occurrences() {

		System.out.println("OCCURENCES OF THE SAME SELECTION");

		int apples = 0;
		int oranges = 0;
		int bananas = 0;
		int onions = 0;
		int pickles = 0;
		int pears = 0;
		int broccoli = 0;
		int carrots = 0;
		int asparagus = 0;
		int peaches = 0;
		int beans = 0;
		int watermelon = 0;
		int pistachios = 0;
		int grapefruit = 0;
		int avocados = 0;

		for (int i = 0; i < cart.size(); i++) {
			if (("Apples").equals(cart.get(i))) {
				++apples;
			} else if (("Oranges").equals(cart.get(i))) {
				++oranges;
			} else if (("Bananas").equals(cart.get(i))) {
				++bananas;
			} else if (("Onions").equals(cart.get(i))) {
				++onions;
			} else if (("Pickles").equals(cart.get(i))) {
				++pickles;

			} else if (("Pears").equals(cart.get(i))) {
				++pears;
			} else if (("Broccoli").equals(cart.get(i))) {
				++broccoli;

			} else if (("Carrots").equals(cart.get(i))) {
				++carrots;
			} else if (("Asparagus").equals(cart.get(i))) {
				++asparagus;
			} else if (("Peaches").equals(cart.get(i))) {
				++peaches;
			} else if (("Green Beans").equals(cart.get(i))) {
				++beans;
			} else if (("Watermelon").equals(cart.get(i))) {
				++watermelon;
			} else if (("Pistachio").equals(cart.get(i))) {
				++pistachios;
			} else if (("Grapefruit").equals(cart.get(i))) {
				++grapefruit;
			} else if (("Avocados").equals(cart.get(i))) {
				++avocados;
			}
		}

		System.out.printf(
				"1.%s%d\n2.%s%d\n3.%s%d\n4.%s%d\n5.%s%d\n6.%s%d\n7.%s%d\n8.%s%d\n9.%s%d\n10.%s%d\n11.%s%d\n12.%s%d\n13.%s%d\n14.%s%d\n15.%s%d\n",
				"Apples ", apples, "Oranges ", oranges, "Bananas ", bananas, "Onions ", onions, "Pickles ", pickles,
				"Pears ", pears, "Broccoli ", broccoli, "Carrots ", carrots, "Asparagus ", asparagus, "Peaches ",
				peaches, "Green Beans ", beans, "Watermelon ", watermelon, "Pistachios ", pistachios, "Grapefruit ",
				grapefruit, "Avocados ", avocados);
	}
	
	public double getAverage()
	{
		double sum =0;
		
		for(double amount : quantityCostArray)
		{
			sum+=amount;
		}
		return sum/quantityCostArray.size();
	}

	public void displayInvoice() {

		
		
		
		System.out.printf("%s%20s%20s\n","ITEM","QUANTITY","COST");
		System.out.println("_______________________________________");
		double subtotal = 0.00;
		double tax = 0;
		double taxRate = 0.095;
		double total = 0.00;
		for(int i = 0; i<cart.size();i++)
		{
			String s = cart.get(i);
			int q = quantityValues.get(i);
			double c = quantityCostArray.get(i);
			System.out.printf("%s%10d%20s%f\n",s,q,"$",c);
			subtotal+=c;
		}
		tax = taxRate * subtotal;
		total = tax + subtotal;
		System.out.println("                            SUBTOTAL:  $" + subtotal);
		System.out.println("                                 TAX:   $" + tax);
		System.out.println("__________________________________________________");
		System.out.println("                               TOTAL: $" + total);
		
	}

}
