/**Feb 20, 2019
 * @author Joseph Kirkish
 */
package chapterSeven;

/**
 * @author jkirkish Ten voters were asked to rate on scale of 1 to 10 the
 *         quality of the political issues being addressed in the election
 *         overall. With 1 being "weak" and 10 being "strong". This survey
 *         places 10 responses in an Integer array to evaluate the frequency of
 *         each reponse
 */
public class SurveyResults {

	public static void main(String[] args) {
		// vote responses
		Integer[] ratings = { 10, 5, 2, 5, 5, 6, 7, 8, 19, 1 };
		int[] regularity = new int[10];// array of frequency voters

		for (int vote = 0; vote < ratings.length; vote++) {
			try {
				++regularity[ratings[vote]];
			} // end try
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.printf(" ratings[%d] = %d\n\n", vote, ratings[vote]);
			} // end catch
		} // end for
		System.out.printf("%s%10s\n", "Ratings", "Frequency");
		
		//output each element in the ratings and regularity array
		for(int score = 1; score < regularity.length; score++)
		{
			System.out.printf("%7d%10d\n", score, regularity[score]);
		}
	}
	
	
}
