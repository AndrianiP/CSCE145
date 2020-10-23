/*
* Adriani Perez
*/

package CoinMachine;

import java.util.Scanner;

public class Coin {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
		System.out.println("\nEnter a whole number from 1 to 99. The machine will determine a combination of coins.");
		int coins = keyboard.nextInt();
			if (coins > 99 || coins < 1)
			{
                System.out.println("\nPlease choose your amount of coins again.");
                System.exit(1);

            }
        //This should close the scanner so it isnt taking resources after the program gets the users input
        keyboard.close();  

        int IntVal = coins;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;


        while (coins > 25)
        {
            quarter = IntVal / 25;
            coins = coins % 25;
            //I use the modulo to get the remainder this was important
            // and then use while loops to just subtract from the total amount of coins and add + 1 to the counter
        }
        while (coins > 10)
        {
            dime = dime + 1;
            coins = coins - 10;
        }
        while (coins > 5)
        {
            nickel = nickel + 1;
            coins = coins - 5;
        }
        while (coins != 0)
        {
            penny = penny + 1;
            coins = coins - 1;
        }
        System.out.println("Number of Quarters: " +quarter);
        System.out.println("Dimes Used: " +dime);
        System.out.println("Nickel Used: " +nickel);
        System.out.println("Pennies Used: " +penny);

        System.exit(0);
    }
}
