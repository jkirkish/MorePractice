/**
 * 
 */
package chapterThree;

/**
 * @author jkirkish
 * Date Sept 12, 2018
 */
public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//declare a Date object to use the Date class
		Date date = new Date();
	    date.displayDate();
	    
	    //lets change the date to 7/14/1980
	    date.setDay(14);
	    date.setMonth(07);
	    date.setYear(1980);
	    System.out.println("\nThe new date is ");
	    date.displayDate();
	    
	    //Lets set the month to January
	    date.setMonth(1);
	    System.out.println("\nThe "+ date.getMonth()+ " month of the year is January");
	    date.displayDate();
	    
	    //Lets switch the day to 28
	    date.setDay(28);
	    System.out.println("\nThe day is the "+ date.getDay() + "th");
	    date.displayDate();
	    
	  //Lets switch the year to 2157
	    date.setYear(2157);
	    System.out.println("\nThe Year is "+ date.getYear());
	    date.displayDate();
	    
	}

}
