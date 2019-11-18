package chapterThree;

public class InvoiceTest {

	public static void main(String[] args) {
		
		//Invoice(String part, String Desc, int quant, double p)
		Invoice invoice = new Invoice("W567794", "Wrench",5,37.54);
		
		System.out.println("PartNumber is " + invoice.getPartNumber());
		System.out.println("Part Description is " + invoice.getPartDescription());
		System.out.println("Quantity is " + invoice.getQuantity());
		System.out.println("Price is $" + invoice.getPrice());
		System.out.println("Invoice is $" + invoice.getInvoiceAmount());
		
		//Change PartNumber from W567794 to H395
		invoice.setPartNumber("H395");
		//Change Part Description from Wrench to Hammer 
		invoice.setPartDescription("Hammer");
		//Change Quantity from 5 to 8
		invoice.setQuantity(8);
		//Change Price from 37.54 to 145.24
		invoice.setPrice(145.24);
		
		System.out.println("___________________________________________________");
		System.out.println("The new product invoice for a hammer");
		System.out.println("PartNumber is " + invoice.getPartNumber());
		System.out.println("Part Description is " + invoice.getPartDescription());
		System.out.println("Quantity is " + invoice.getQuantity());
		System.out.println("Price is $" + invoice.getPrice());
		System.out.println("Invoice is $" + invoice.getInvoiceAmount());
	}

}
