/**Sep 18, 2019
 * @author Joseph Kirkish
 */
package chapter10;


import java.util.Date;


/**
 * @author jkirkish
 * This class is to practice with the date java library
 */
public class CalendarDates {

	/**The class Date represents a specific instant in time, with millisecond precision. The Date class of java.util package implements Serializable, Cloneable and Comparable interface. It provides constructors and methods to deal with date and time with java.

Constructors

Date() : Creates date object representing current date and time.
Date(long milliseconds) : Creates a date object for the given milliseconds since January 1, 1970, 00:00:00 GMT.
Date(int year, int month, int date)
Date(int year, int month, int date, int hrs, int min)
Date(int year, int month, int date, int hrs, int min, int sec)
Date(String s)
Note : The last 4 constructors of the Date class are Deprecated.
	 * 
	 */
	private Date date1;
	
	
	//new constructor for Calendar Dates
	@SuppressWarnings("deprecation")
	public CalendarDates(int year, int month, int date) {
		
		 //Default constructor date is Feb, 10, 2019
		 this.date1 = new Date(119, 1, 10);
	}
	
	public Date getCurrentDate()
	{
		
		Date date = new Date();
		return date;
	}
	public void setDate(int year, int month, int day)
	{
		 this.date1 = new Date( year, month, day);
	}
	@Override
	public String toString()
	{
		return date1.toString();
		
	}
	

}
