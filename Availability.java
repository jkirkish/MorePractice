/**Feb 6, 2019
 * @author Joseph Kirkish
 */
package chapterSix;

/**
 * @author jkirkish
 *
 */
public enum Availability {
	// declare constants for availability
	OPEN(0, "OPEN"), CLOSED(1, "CLOSED"), TENTATIVE(2, "TENTATIVE");

	// instance field for value
	public int value;
	public String status;

	// constructor that takes an int value
	Availability(int val, String stat) {
		this.value = val;
		this.status = stat;
	}

	// set value method
	public void setValue(int val) {
		this.value = value;
	}

	// accesor that access value
	public int getValue() {
		return value;
	}

	// set value method
	public void setStat(String st) {
		this.status = st;
	}

	// accesor that access value
	public String getStatus() {
		return status;
	}
}
