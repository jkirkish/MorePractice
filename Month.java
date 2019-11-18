/**Feb 3, 2019
 * @author Joseph Kirkish
 */
package chapterSix;

/**
 * @author jkirkish
 *
 */
public enum Month 
{
	//declare constants for the months of the year
	JAN("JAN"),
	FEB("FEB"),
	MAR("MAR"),
	APR("APR"),
	MAY("MAY"),
	JUN("JUNE"),
	JUL("JUL"),
	AUG("AUG"),
	SEPT("SEPT"),
	OCT("OCT"),
	NOV("NOV"),
	DEC("DEC");
	
	//instance fields
	public final String month;
	
	//constructor for Month with a String argument
	 Month(String mon)
	{
		this.month = mon;
	}
	//getValue method 
	public String getValue()
	{
		return month;
	}
}
