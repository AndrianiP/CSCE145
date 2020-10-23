/*
 * Adriani Perez
 * CSCE 145 Exam01 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
import java.util.Scanner;
public class Question02 {

	public static void main(String[] args) {
		Scanner keyboard;
		if(args == null || args.length == 0)
		{
			keyboard = new Scanner(System.in);
			System.out.println("Welcome to the Echo Program! I'll echo whatever is said until you enter \"quit\"");
		}
		else
		{
			keyboard = new Scanner(args[0]);
		}
//-----------------------------------------------------------------------------------
        //Write your solution here
		

		Boolean statement = true;
		while (statement == true){
			final String echo = keyboard.next();
			if (echo.equalsIgnoreCase("quit")){
				System.out.println("Goodbye!");
				System.exit(0);
			}
			else
			System.out.print("Echo:");
			System.out.print(echo);
			System.out.println();
		}
		






	}//Do not alter this
//Space for other methods if necessary-----------------------------------------------
	//Write those here if necessary
	
//-----------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * The Echo Program was the easiest to create a solution for.
 *  In order to keep get the users input we would need to create a Scanner variable called keyboard.
 *  We asked the user for what words they would want to be repeated back them.
 *  Then we needed to store the users input in a variable to later be able to print it out.
 *  This variable was named echo for simplicity reasons. The program was required to keep repeating words back to the user as long as they did not type the word quit.
 *  A while loop was used to constantly check for the users input and store it as the variable echo. The user’s phrase/word was then printed out for them to see.
 *  This would keep going on and on.
 *  If the user typed in “quit” no matter what the capitalization of the word, the message they would get in response would be “Goodbye”. The program would then terminate.
 */