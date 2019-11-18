package chapterFive;

public class counterControllRep {

	//calculate the age
	public void ageCounter()
	{
		int age = 1
				;
		
		while(age <= 100)//loop continuation condition
		{
			System.out.print(age);
			age++; //control variable incrementer by 1
		}//end of the while loop
		System.out.println("while Looop"); //print a next line
	}
	public void forAgeCounter()
	{
		int sum = 0;
		//for statemet header includes initialization, loop-continuation condition and increment
		for(int age = 0; age <=100;age++)
		{
			System.out.print(" "+ age);
			
		}
		System.out.println();
		//decrement a forloop
		for(int age = 100; age >=1;age--)
		{
			System.out.print(" "+ age);
			
		}
		System.out.println();
		//add increments of 4 to amount and add to sum
		for(int amount = 4; amount <=40;amount+=2)
		{	sum+=amount;
		
			System.out.print(" "+ sum);
		}
		System.out.println();
		//increment i in increments of 5
		for(int i = 5; i <=555; i+=5)
		{    System.out.print(" " + i);
			
		}
		System.out.println();
		//decrement j by 4 starting at 500
		for(int j = 500; j >=4; j-=4)
		{    System.out.print(" "+j);
			
		}
		System.out.println();
		//decrement l by 9 from 999
		for(int l = 999; l >=0; l-=9)
		{    System.out.print(" "+l);
			
		}
	}
}
