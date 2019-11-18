package chapterThree;

/*Create a class called Date that includes three instance variables- a month (type) int
 * a day (type int) and a year (type int). Provide a constructor that initializes the 
 * three instance variables and assumes that the values provided are correct.  Provide a 
 * set and get method for each instance variable. Provide a method displayDate that displays 
 * the month, day and year separated by forwarded slashes(/). Write a test application named 
 * DateTest that demonstrates class Dates capabilities.
 * Author Joseph Kirkish
 * Date 09-12-2018
 */
public class Date {
	
	//instance variables
	private int month;
	private int day;
	private int year;
	
	public Date()
	{
		month = 00;
		day = 00;
		year = 0000;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate()
	{
		System.out.printf("%d/%d/%d", getMonth(), getDay(), getYear());
	}

}
