

//Adriani Perez
//10/23/2020

import java.util.Scanner;

public class coffeeTest {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Coffee coffee01 = new Coffee();

        System.out.println("Whats the name for the first coffee?");
        coffee01.setName(keyboard.nextLine());

        System.out.println("The amount of caffeine in milligrams in this coffee?");
        coffee01.setCaffeine(keyboard.nextDouble());
        keyboard.nextLine();

        Coffee coffee02 = new Coffee();

        System.out.println("Whats the name for the second coffee?");
        coffee02.setName(keyboard.nextLine());

        System.out.println("The amount of caffeine in milligrams in this coffee?");
        coffee02.setCaffeine(keyboard.nextDouble());

        System.out.println("\nIt would take "+coffee01.riskyAmount()+" "+coffee01+" before it's dangerous to drink more.");

        System.out.println("\nIt would take "+coffee02.riskyAmount()+" "+coffee02+" before it's dangerous to drink more.");

        
        keyboard.close();
    }
}