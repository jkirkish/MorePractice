/**Sep 21, 2019
 * @author Joseph Kirkish
 */
package chapter10;

import java.util.Date;

/**
 * @author jkirkish
 *
 */
public class HotelReservation extends SuperReservation{

	/**
	 * A hotel reservation is a subclass of SuperReservation. 
	 */
	private String hotelName;
	private String location;
	private Date Checkin;
	private Date Checkout;
	private int rooms;
	private int adults;
	private int child;
	private double price;
	
	//THis is the constructor
	public HotelReservation(String first, String last, String hname,String l, Date c, Date out,int r,int a, int ch, double p) 
	{
		super(first,last);
		hotelName = hname;
		location = l;
		Checkin = c;
		Checkout = out;
		rooms = r;
		adults = a;
		child = ch;
		price = p;
	}


	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}


	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}


	/**
	 * @return the checkin
	 */
	public Date getCheckin() {
		return Checkin;
	}


	/**
	 * @return the checkout
	 */
	public Date getCheckout() {
		return Checkout;
	}


	/**
	 * @return the rooms
	 */
	public int getRooms() {
		return rooms;
	}


	/**
	 * @return the adults
	 */
	public int getAdults() {
		return adults;
	}


	/**
	 * @return the child
	 */
	public int getChild() {
		return child;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}


	/**
	 * @param checkin the checkin to set
	 */
	public void setCheckin(Date checkin) {
		Checkin = checkin;
	}


	/**
	 * @param checkout the checkout to set
	 */
	public void setCheckout(Date checkout) {
		Checkout = checkout;
	}


	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}


	/**
	 * @param adults the adults to set
	 */
	public void setAdults(int adults) {
		this.adults = adults;
	}


	/**
	 * @param child the child to set
	 */
	public void setChild(int child) {
		this.child = child;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
