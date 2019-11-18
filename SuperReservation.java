/**Sep 17, 2019
 * @author Joseph Kirkish
 */
package chapter10;

/**
 * @author jkirkish
 *
 */
public class SuperReservation{

	/**
	 * Reservation is the parent class for all types of reservation. 
	 * you can have hotel, rental car, airline and cruise reservations
	 */
	private String firstName;
	private String lastName;
	
	public SuperReservation(String first, String last) 
	{
		setFirstName(first);
		setLastName(last);
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString()
	{
		//String format for reservation
		return String.format(":%s%s", getFirstName(),getLastName());
	}
}
