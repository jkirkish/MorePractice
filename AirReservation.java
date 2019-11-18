/**Sep 17, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jkirkish when a passenger books a reservation. This a class that uses
 *         methods to manipulate its private instance variables.
 */
public class AirReservation extends SuperReservation {

	// instance variables
	private String depCity;
	private String ArrCity;
	private Date depDatel;
	private Date returnDate;
	private double price;
	private String seat;// First, Business or Economy
	private int seatValue;
	private char seatLetter;

	public AirReservation(String first, String last, String dcity, String aCity, int year, int month, int day, 
			int year1, int month1, int day1, double cost,
			String type) {

		super(first, last);
		depCity = dcity;
		ArrCity = aCity;
		setDepDatel(year, month, day);
		setReturnDate( year1, month1, day1);
		setPrice(cost);
		setSection(type);
	}
	public String getDepCity() {
		return depCity;
	}

	/**
	 * @param depCity
	 *            the depCity to set
	 */
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	/**
	 * @return the arrCity
	 */
	public String getArrCity() {
		return ArrCity;
	}

	/**
	 * @param arrCity
	 *            the arrCity to set
	 */
	public void setArrCity(String arrCity) {
		ArrCity = arrCity;
	}

	/**
	 * @return the depDatel
	 */
	public String getDepDatel() {
		
		return depDatel.toString();
	}

	/**
	 * @param day 
	 * @param month 
	 * @param year 
	 * @param depDatel
	 *            the depDatel to set
	 * @throws ParseException 
	 */
	public void setDepDatel(int year, int month, int day) {
		
		this.depDatel = new Date(year,month,day);
		
	}

	/**
	 * @return the returnDate
	 */
	public String getReturnDate() {
		
		return returnDate.toString();
	}
	/**
	 * @param returnDate
	 *the returnDate to set
	 */
	public void setReturnDate(int Year,int month, int day) {
		
		this.returnDate = new Date(Year, month, day);
		//set the return date
		boolean before;
		if(before = returnDate.before(depDatel))
		{
			System.err.println("Return date must be after the Departure time");
		}
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		if (price >= 0.0)
			this.price = price;
		else
			throw new IllegalArgumentException("Price must be above 0.00");

	}

	/**
	 * @return the seat
	 */
	public String getSection() {
		return seat;
	}

	/**
	 * @param seat
	 *            the seat to set Economy, Business and First
	 */
	public void setSection(String s1) {
		if (s1.equals("Economy"))
			this.seat = s1;
		else if (s1.equals("Business"))
			this.seat = s1;
		else if (s1.equals("First"))
			this.seat = s1;
		else
			throw new IllegalArgumentException("Must be First, Business, Economy");
	}

	public void setSeatNumber(int value, char letter) {
		// array of letters and numbers
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26 };
		//set the seat number
		for (int i : numbers) {
			if (i == value)
				;
			{
				this.seatValue = value;
			}
		}
		//set the seat letter
		for (char a : letters) {
			if (a == letter) {
				this.seatLetter = letter;
			}
		}

	}
	public String getAssignedSeat()
	{
		return String.format("%s%d", seatValue,seatLetter);
	}
	// return String representation of a Reservation
	@Override
	public String toString() {
		return String.format("%s: %s %s\n%s: %s %s: %s\n%s: %s\n %s: %s\n%s: %f\n%s: %s", "Name", getFirstName(), getLastName(),
				"Departure City", getDepCity(), ",Arrival City", getArrCity(), "Departure Date", getDepDatel(),
				"Arrival Date", getReturnDate(), "TotalAmount", getPrice(), "Seat", getSection());

	}

}
