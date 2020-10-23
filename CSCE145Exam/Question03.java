/*
 * Adriani Perez
 * CSCE 145 Exam01 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question03 {

	public static int[] array;//The array to be used in the problem
	public static void main(String[] args) {
		int number;//Used for the stairs
		if(args == null || args.length == 0)
		{
//-----------------------------------------------------------------------------------
			int[] tempArray ={1,2,3,4,5,6,7,8};//You may change these values to test your solution
//Do not alter-----------------------------------------------------------------------
			array = tempArray;
		}
		else
		{
			
		}
//-----------------------------------------------------------------------------------
		//Write your solution here


		int maxEven = 0;
		int maxOdd = 0;

		int evenCheck = 0;
		int oddCheck = 0;

		for (int i = 0; i < array.length; i++){

			int Val = array[i];

			if (Val % 2 == 0){	
				if(maxEven < Val){
				maxEven = Val;

				evenCheck++;
				}	
			}
			else{
				if(maxOdd < Val){

					maxOdd = Val;
					oddCheck++;
				
				}
			}
			
		}
		if (evenCheck == 0){
			maxEven = -1;
		}
		if (oddCheck == 0){
			maxOdd = -1;
		}

		System.out.println("\nMax Even: "+maxEven);
		System.out.println("Max Odd: "+maxOdd);
		
		
		
	
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * In order to create a solution, we needed to get the largest odd and the largest even in a set of numbers.
 *  To do this I would create two variables maxEven and maxOdd.
 *  They were both set to zero to begin with.
 *  They will be used to compare each number that will be in the array to the current value of maxEven and maxOdd.
 *  The array would be created and each number in the array would be assigned to a variable named Val.
 *  If the number that was being looked at was divisible by 2 and larger than the current value of maxEven, then the current value of maxEven would be reassigned.
 *  If this number were not divisible by 2, that number would be compared to check if it was larger than maxOdd, if it was then maxOdd would be changed to the current value of the number being looked at in the array.
 *  We were also to check whether the array had no odds and no evens.
 *  If they were no evens, then maxEven would be set to “-1.” If they were no odds, then maxOdd would be set to “-1” as well.
 *  Then it would finally print out which number in the array was the largest even and the largest odd.
 */