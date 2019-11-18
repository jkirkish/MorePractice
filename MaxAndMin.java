/**Jan 12, 2019
 * @author Joseph Kirkish
 */
package chapterSix;

import java.util.Scanner;

/**
 * @author jkirkish
 *
 */
public class MaxAndMin {

	//run the maximum value method with 5 values
	public static float maximum(float a,float b, float c) 
	{
		//make a known as the largest number
		float maxNumber = a;
		
		//determine whether b is greater than the maxNumber
		if(b > maxNumber)
			maxNumber = b;
		
		//determine whether c is greater than maxNumber
		if(c > maxNumber)
			maxNumber = c;
		
		return maxNumber;
		
	}
	public static float min(float j,float k, float i) 
	{
		//make a known as the smallest number
		float mixNumber = j;
		
		//determine whether b is smaller than the maxNumber
		if(k < mixNumber)
			mixNumber = k;
		
		//determine whether c is smaller than maxNumber
		if(i < mixNumber)
			mixNumber = i;
		
		return mixNumber;
		
	}
	
	
	public static void main(String[] args) 
	{
		//prompt the user to find three numbers and locate the max value
		Scanner number = new Scanner(System.in);
		
		//prompt for and input three numbers
		System.out.print("Enter five floating-point values:");
		float value1 = number.nextFloat();
		float value2 = number.nextFloat();
		float value3 = number.nextFloat();
		
		// determine the max value
		float result = maximum(value1, value2, value3);
		//determine the min value
		float min = min(value1, value2,value3);
		//reveal what the max value is
		System.out.println("Maximum is: " + result );
		//reveal what the min value is
		System.out.println("Minimum is: " + min );
		
		
	}

}
