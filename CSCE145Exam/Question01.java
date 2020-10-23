/*
 * Adriani Perez
 * CSCE 145 Exam01 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question01 {

	public static void main(String[] args) {
		int number;//Used for the stairs
		if(args == null || args.length == 0)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the value to draw some stairs");
			number = keyboard.nextInt();
			keyboard.nextLine();
		}
		else
		{
			number = Integer.parseInt(args[0]);
		}
//-----------------------------------------------------------------------------------
		//Write your solution here

		if(number <= 0){
			System.exit(0);
		}

		int width = number;
		int height = number;

		for (int i = 0; i < 3; i++){

        	for (int k = 0; k < height; k++){
            	for(int j = 0; j < width; j++){
					System.out.print("*");
				}
				System.out.println("");

			}
			height++;
			width++;
		}		
		
	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * 
 * In order to create the solution, we needed to get the users input for the number of stairs. 
 * We then would save the users input and check if the entered a value that is greater than zero.
 * If the value is less than zero, the program will terminate. Three For Loops were used to keep track of the width, height, and the number of stairs of the pyramid.
 * The width and height were the same number for each step so different variables did not need to be created for them but for my understanding I created different ones.
 * The inner-most loop oversaw the width of the stairs. It would print out the original thickness of the stairs that was provided by the user.
 * The loop in the middle managed the height of the pyramid.
 * After each iteration, the pyramid is supposed to increase the height by one row and extend one column worth of width.
 * In order to do this, we added plus one the height and width after both loops.
 * The outside loop restricted the number of stairs to only 3 huge stairs.
 * 
 * 
 */