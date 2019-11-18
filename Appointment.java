/**Apr 11, 2019
 * @author Joseph Kirkish
 */
package chapter8;

import java.util.*;
/**
 * @author jkirkish
 *
 */
public class Appointment {

	private int date; // 1-31
	private int month; // 1-12
	private int year;// example 2019 4 digit format 0000
	private String dayOfWeek;// Mon, Tue, Wed, Thur, Fri, Sat, Sun
	private int hour;// 0-23
	private int minute;// 0-59
	private int second;// 0-59
	private static int appointments = 0;

	/**
	 * @return the date
	 */

	public Appointment() {
		this(0, 0, 0000, "Mon", 0, 0, 0);
	}

	public Appointment(int d, int mon, int y, String dayOfW, int h, int m, int s) {
		this.date = d;
		this.month = mon;
		this.year = y;
		this.dayOfWeek = dayOfW;
		this.hour = h;
		this.minute = m;
		this.second = s;
		appointments++;
		
	}

	public Appointment(int d, int mon, int y) {
		this.date = d;
		this.month = mon;
		this.year = y;

	}

	public Appointment(Appointment appoint) {
		this(appoint.getDate(), appoint.getMonth(), appoint.getYear(), appoint.getDayOfWeek(), appoint.getHour(),
				appoint.getMinute(), appoint.getSecond());

	}

	public int getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(int date) {
		if (1 <= date && date <= 31) {
			this.date = date;
		} else
			throw new IllegalArgumentException("Date was out of range");
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month
	 *            the month to set
	 */
	public void setMonth(int month) {
		if (1 <= month && month <= 12) {
			this.month = month;
		} else
			throw new IllegalArgumentException("Month was out of range");
	}

	/**
	 * @return the year
	 */
	public int getYear() {

		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		Integer y = year;
		String temp = y.toString();
		if (temp.length() == 4) {
			this.year = year;
		} else
			throw new IllegalArgumentException("Please Enter a 4 digit year 0000");
	}

	/**
	 * @return the dayOfWeek
	 */
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * @param dayOfWeek
	 *            the dayOfWeek to set
	 */
	public void setDayOfWeek(String dayOfWeek) {
		String[] days = { "Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun" };

		for (int i = 0; i < days.length; i++) {
			if (dayOfWeek.equalsIgnoreCase(days[i])) {
				this.dayOfWeek = dayOfWeek;
			}
		}

	}

	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @param hour
	 *            the hour to set
	 */
	public void setHour(int hour) {
		if (0 <= hour && hour <= 24) {
			this.hour = hour;
		} else
			throw new IllegalArgumentException("Hour was out of range");

	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @param minute
	 *            the minute to set
	 */
	public void setMinute(int minute) {
		if (0 <= minute && minute <= 60) {
			this.minute = minute;
		} else
			throw new IllegalArgumentException("Minute was out of range");

	}

	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * @param second
	 *            the second to set
	 */
	public void setSecond(int second) {
		if (1 <= second && second <= 31) {
			this.second = second;
		} else
			throw new IllegalArgumentException("Second was out of range");

	}

	// Produce a string output for the scheduled appointment
	public String toString() {
		String d = String.format("%02s %02d,%02d", month, date, year);
		String t = String.format("%02d:%02d:%02d", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
				(hour < 12 ? "AM" : "PM"));
		String s = "Your Appointment is scheduled on " + d + " at " + t;
		return s;
	}
	//get the number of appointments created
	public static int getAppointments()
	{
		return appointments;
	}

}
