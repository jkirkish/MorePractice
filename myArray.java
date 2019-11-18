/**Feb 9, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

/**An array is agroup of variables called elements containing values that all have the same type
 * Arrays are objects, so they're considered reference types.  The elements in an array can either
 * be primitive types or reference types. The position number of an elemenet is called the element's 
 * index or subscript. 
 * @author jkirkish
 *
 */
public class myArray {

	
	public static void main(String[] args) {
		
		//instantiate an object of DiffTypeArrays
		DiffTypeArrays arrayExamples = new DiffTypeArrays();
		arrayExamples.showEmployees();
		arrayExamples.showTruths();
		arrayExamples.showGender();
		arrayExamples.showAges();
		arrayExamples.shoWeights();
		arrayExamples.pageCount();
		arrayExamples.monSalaries();
		arrayExamples.speedLimits();
		arrayExamples.showTemps();
	
	}

}
