/**Jan 10, 2019
 * @author Joseph Kirkish
 */
package chapterFive;

/**
 * @author jkirkish
 *
 */
public class BloodTest {

	public static void main(String[] args) {
		
		bloodPressure test = new bloodPressure("Joseph");
		test.displayMessage();
		test.inputPressures();
		test.deterCat(test.getSystolic(), test.getDiastolic());
		test.DisplayReport();

	}

}
