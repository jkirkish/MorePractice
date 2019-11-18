/**Jan 25, 2019
 * @author Joseph Kirkish
 * A schedule report lists information on a person who wants to schedule 
 * a dental appointment.  A person or patient will input their identity
 * information and then select what month of the year they want to schedule
 * a dental appointment.  The system will check the availability for that 
 * month to see if a time is open, closed or tentative. 
 */
package chapterSix;

import java.util.Random;

/**
 * @author jkirkish
 *
 */
public class scheduleAppoint {

	//instance fields
	private String firstName;
	private String lastname;
	private double AppointCost;
	private char gender;
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	private String APO;
	private String POBOX;
	

	/**
	 * @param firstName
	 * @param lastname
	 * @param appointCost
	 * @param gender
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param zipCode
	 */
	public scheduleAppoint(String firstName, String lastname, double appointCost, char gender, String streetAddress,
			String city, String state, int zipCode) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		AppointCost = appointCost;
		this.gender = gender;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	
	/**
	 * @return the firstName
	 */
	private String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastname
	 */
	private String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	private void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the appointCost
	 */
	private double getAppointCost() {
		return AppointCost;
	}

	/**
	 * @param appointCost
	 *            the appointCost to set
	 */
	private void setAppointCost(double appointCost) {
		AppointCost = appointCost;
	}

	/**
	 * @return the gender
	 */
	private char getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	private void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the streetAddress
	 */
	private String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * @param the streetAddress
	 */
	private void setStreetAddress(String APO1, String POBOX1)
	{
		//some addresses are P.O.BOX or APO
		 this.APO = APO1;
		 this.POBOX = POBOX1;
	}
	private String getStreetAddress1()
	{
		//some addresses are APO miltary
		return APO;
	}
	private String getStreetAddress2()
	{
		//some addresses are APO miltary
		return POBOX;
	}

	/**
	 * @param streetAddress
	 *            the streetAddress to set
	 */
	private void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the city
	 */
	private String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	private void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	private String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	private void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	private int getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	private void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	private static String reportAvail()
	{
		//random object declared and used to pick
		//random number 1 thru 3
		Random ran = new Random();
		int num = ran.nextInt(3);
		String stat = "nothing";
		//ran number can take one of three choices
		if(num == 0)
		{
			//if num is 0 status is open
		 stat = Availability.OPEN.getStatus();
		}
		else if(num == 1)
		{
			//if num is 1 status is closed
			stat = Availability.CLOSED.getStatus();
		}
		else if(num == 2)
		{
			//if num is 2 status is tentative
			stat = Availability.TENTATIVE.getStatus();
		}
		 return stat;
	}
	public void deterStatus(int month)
	{
		
		
		//switch statement that corresponds to status to the month selected
		switch(month) {
		case 1:
			System.out.println("Patient" +":The status of " + Month.JAN.getValue() + " is: " + reportAvail()); 
			break;
		case 2:
			System.out.println("Patient" +":The status of  " + Month.FEB.getValue() + " is: " + reportAvail()); 
			break;
		case 3:
			System.out.println("Patient" + ":The status of " + Month.MAR.getValue() + " is: " + reportAvail()); 
			break;
		case 4:
			System.out.println("Patient" +":The status of " + Month.APR.getValue() + " is: " + reportAvail()); 
			break;
		case 5:
			System.out.println("Patient" +":The status of " + Month.MAY.getValue() + " is: " + reportAvail());
			break;
		case 6:
			System.out.println("Patient" +":The status of " + Month.JUN.getValue() + " is: " + reportAvail());
			break;
		case 7:
			System.out.println("Patient" +":The status of " + Month.JUL.getValue() + " is: " + reportAvail());
			break;
		case 8:
			System.out.println("Patient" +":The status of " + Month.AUG.getValue() + " is: " + reportAvail());
			break;
		case 9:
			System.out.println("Patient" +":The status of " + Month.SEPT.getValue() + " is: " + reportAvail());
			break;
		case 10:
			System.out.println("Patient +:The status of " + Month.OCT.getValue() + " is: " + reportAvail());
			break;
		case 11:
			System.out.println("Patient"+ ":The status of " + Month.NOV.getValue() + " is: " + reportAvail());
			break;
		case 12:
			System.out.println("Patient" +":This status of " + Month.DEC.getValue() + " is: " + reportAvail());
			break;
		default:
			System.err.println("PLEASE SPECIFY A MONTH DURING THE YEAR!");
			break;
		}
		
	}
}
