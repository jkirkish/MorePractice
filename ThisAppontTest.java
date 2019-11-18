/**May 28, 2019
This class demonstrates a class inside a class
 * @author Joseph Kirkish
 */
package chapter8;

import java.sql.Date;

/**
 * @author jkirkish
 *
 */
public class ThisAppontTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleAppoint App = new SimpleAppoint(16,30);
		App.setName("Angela");
		System.out.println(App.toString());
		
	}//end of main method

}//end of ThisAppointTest

//class simple appoint
class SimpleAppoint
{
	private String name;
	private Date date;
	private int hour, minute;
	/**
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
//end of class simple appoint


//constructor SImppleAppoint
public SimpleAppoint(int hour, int minute)
{
	this.hour = hour;
	this.minute = minute;
}

//
public String toString()
{	//
	return String.format("%15s%10d%10d", getName(), hour, minute);
}
}
