/*
 * Adriani Perez
 * CSCE 145 Exam01 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question04 {

	public static double[] array;//The array to be used in the problem
	public static void main(String[] args) {
		int number;
		if(args == null || args.length == 0)
		{
//-----------------------------------------------------------------------------------
			double[] tempArray ={1,2,3,4,5,6,7,8,9,10};//You may change these values to test your solution
//Do not alter-----------------------------------------------------------------------
			array = tempArray;
		}
		else
		{

		}
//-----------------------------------------------------------------------------------
		//Write your solution here

		
		
		Double sum = 0.0;
		double divsor = 0;
		
		for (int i = 0; i < array.length; i++){
			Double val = array[i]; 

			if (val > 0){
				
				divsor++;
				sum = sum + val;
			}

		}
		if(divsor == 0){
			
			System.out.println("Average: 0.0");
			System.exit(0);
		}

		Double average = sum / divsor;

		System.out.println("Average: "+average);
				
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * 
 * In order to create the solution, we needed to get the average from a set of numbers.
 *  We would create two variables, sum, and divisor.
 *  These both were set two zero as we have not begun adding or even taken into consideration the numbers that were provided for us. 
 * We decided to create an array that would be the length of the set of numbers.
 *  For each value looked at in the array it would be assigned to a variable.
 *  If the current number that was being looked at was larger than zero, it would be added to the variable called sum.
 *  It would also increase the divisor by one. If the value of the number were not greater than zero it would skip that number and ignore it not contributing the final average. 
 * This process would continue until there were no more numbers to be looked at in the array. Then the average is calculated by dividing sum and divisor.
 *  Then print out the average to user. If none of the numbers were greater than zero in the array, this would return the average as “0.0” and then terminate the program
 * 
 * 
 */