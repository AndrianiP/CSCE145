// Adriani Perez
// 09/18/2020

import java.util.Scanner;
import java.util.Random;

public class dice {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //gets users number of times that they want the dice rolled
        System.out.println("\nHow many times do you want this dice to be rolled?\n");
        int rolls = keyboard.nextInt();
        if (rolls <= 0)
        {
            System.out.println("\nAtleast roll once!");
            System.exit(1);
        }
        //we no longer need to check for the users input so we close to save processs powering
        keyboard.close();
        Random r = new Random();

        

        int one, two, three, four, five, six;
        //assigns all variables to zero in order to keep track of them later when the dice is rolled
        one = two = three = four = five = six = 0;

        //for loop that stops when i is about to reach the number of rolls
        for (int i = 0; i < rolls; i++)
        {   
            int rInt = r.nextInt(6) + 1;
            System.out.println("\nDice landed on: " +rInt);


            switch(rInt){
                    
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                default:
                    System.out.println("?");
                    break;
            }
   
        }
        
        System.out.println("\nLanded on one: " +one);
        System.out.println("Landed on two: " +two);
        System.out.println("Landed on three: " +three);
        System.out.println("Landed on four: " +four);
        System.out.println("Landed on five: " +five);
        System.out.println("Landed on six: " +six);
    }    
    
}
