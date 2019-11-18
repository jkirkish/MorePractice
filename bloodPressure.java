/**Jan 10, 2019
 * @author Joseph Kirkish
 */
package chapterFive;

import java.util.Scanner;

/**Systolic pressure is when your heat beats and pushes the blood 
 * round your body. Diastolic is when our heart relaxes between beats.
 * To work out what your blood pressure readings mean
 * just find the top number (systolic) and the  bottom number 
 * diastolic and see where it falls in the categories of high
 * blood pressure, pre-high blood pressure, ideal blood pressure,
 * and low blood pressure. 
 * @author jkirkish
 *
 */
public class bloodPressure {
	
	private String name;
	private int systolic;//top number
	private int diastolic;//bottom number
	/**
	 * @return the systolic
	 */
	public int getSystolic() {
		return systolic;
	}

	/**
	 * @param systolic the systolic to set
	 */
	public void setSystolic(int systolic) {
		this.systolic = systolic;
	}

	/**
	 * @return the diastolic
	 */
	public int getDiastolic() {
		return diastolic;
	}

	/**
	 * @param diastolic the diastolic to set
	 */
	public void setDiastolic(int diastolic) {
		this.diastolic = diastolic;
	}
	
	//constructor initializes person name who is getting blood pressure
	public bloodPressure(String PersonName)
	{
		name = PersonName;
	}//end of constructor
	
	//method to set the name
	public void setName(String PersonName) 
	{
		name = PersonName;
	}
	//method to retrieve the person's Name
	public String getName()
	{
		return name;
	}
	//display a Greeting Message to the blood pressure patient
	public void displayMessage()
	{
		//get Name gets the name of the person
		System.out.printf("Greetings, How are you today? \n%s\n\n", getName());
	}
	//input the blood pressure readouts Systolic and diastolic
	public void inputPressures()
	{
		//initiate the Scanner Class
		Scanner readout = new Scanner(System.in);
		Scanner readout1 = new Scanner(System.in);
		
		//Prompt the user for both Systolic and diastolic pressure
		System.out.print(getName() + " Please enter your Systolic Pressure:");
		systolic = readout.nextInt();
		System.out.print(getName() + " Please enter your Diastolic Pressure:");
		diastolic = readout.nextInt();
	}
	//add the user input to the appropriate blood pressure category
		public void deterCat(int systolic, int diastolic)
		{
		

			//determine which readouts belong to what blood pressure category using switch statements
			switch(systolic/10)
			{
			case 19: System.out.println(" YOU HAVE HIGH BLOOD PRESSURE! GET HELP!");
				break;
			case 18:  System.out.println(" YOU HAVE HIGH BLOOD PRESSURE! GET HELP!");
				break;	
			case 17: System.out.println(" YOU HAVE HIGH BLOOD PRESSURE! GET HELP!");
				break;
			case 16:  System.out.println(" YOU HAVE HIGH BLOOD PRESSURE! GET HELP!");
				break;
			case 15: System.out.println( " YOU HAVE HIGH BLOOD PRESSURE! GET HELP!");
				break;
			case 14: System.out.println( " YOU HAVE HIGH BLOOD PRESSURE! GET HELP!");
				break;
			case 13: System.out.println( " YOU HAVE PRE-HIGH BLOOD PRESSURE! PAY ATTENTION TO IT!");
				break;
			case 12: System.out.println( " YOU HAVE PRE-HIGH BLOOD PRESSURE! PAY ATTENTION TO IT!");
				break;
			case 11: System.out.println(" YOU HAVE IDEAL BLOOD PRESSURE! KEEP IT UP!");
				break;
			case 10: System.out.println( " YOU HAVE IDEAL BLOOD PRESSURE! KEEP IT UP!");
				break;
			case 9: System.out.println( " YOU HAVE IDEAL BLOOD PRESSURE! GET HELP!");
				break;
			case 8: System.out.println( " YOU HAVE LOW BLOOD PRESSURE! YOU SHOULD BE CONCERNED!");
				break;
			case 7: System.out.println( " YOU HAVE LOW BLOOD PRESSURE! YOU SHOULD BE CONCERNED!");
				break;
			default: System.out.println("SPEAK TO YOUR DOCTOR ASAP!");
			
			}
			//determine which readouts belong to what diastolic blood pressure category using switch statements
			switch(diastolic/10)
			{
			case 9: System.out.println(" YOU HAVE HIGH BLOOD PRESSURE! GET HELP!");
				break;
			case 8: System.out.println( " YOU HAVE PRE-HIGH BLOOD PRESSURE! PAY ATTENTION TO IT!");
				break;	
			case 7: System.out.println( "YOU HAVE IDEAL BLOOD PRESSURE! KEEP IT UP!");
				break;
			case 6: System.out.println("YOU HAVE IDEAL BLOOD PRESSURE! KEEP IT UP!");
				break;
			case 5: System.out.println( "YOU HAVE LOW BLOOD PRESSURE! GET HELP!");
				break;
			case 4: System.out.println(" YOU HAVE LOW BLOOD PRESSURE! GET HELP!");
				break;
			default: System.out.println( "SPEAK TO YOUR DOCTOR ASAP!");
		}
	}
		public void DisplayReport() 
		{
			System.out.println(getName() + " Your Systolic number is: " + getSystolic());
			System.out.println(getName() + " Your diastolic number is: " + getDiastolic());
		}
		
}//end of class
