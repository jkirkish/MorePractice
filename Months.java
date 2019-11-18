/**Jul 8, 2019
 * @author Joseph Kirkish
 */
package chapter8;

/**
 * @author jkirkish
 *
 */
public enum Months {

	// months of the year
	January("JAN"), February("FEB"), March("MAR"), May("MAY"), June("JUN"), July("JULY"), August("AUG"), September("SEPT"), October("OCT"), November("NOV"), December("DEC");

	//enum instance variable
	private final String month;

	//enum constructor
	Months(String m)
	{
		
		month = m;
	}
	//accessor method for month
	public String getMonth() {
		return month;
	}

}
