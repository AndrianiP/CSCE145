//Adriani Perez

import java.util.Scanner;

public class PBJFrontEnd {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("------------------\nSandwich maker\n------------------");
        System.out.println("---------Sandwhich 1---------");

        // Top Slice Process Beginds
        Bread bread01 = new Bread();
        System.out.println("Enter name of the bread");
        bread01.setName(keyboard.nextLine());

        System.out.println("Enter the number of calories");
        bread01.setCalories(keyboard.nextInt());
        keyboard.nextLine();
        

        System.out.println("Enter the type of bread. Must be 'Honey Wheat', 'White', 'Whole Grain', or 'Whole Wheat'");
        bread01.setType(keyboard.nextLine());
        // Top Slice Process Ends

        // Peanut Butter Process Begins
        PeanutButter peanutButter01 = new PeanutButter();
        System.out.println("-------------------\nPeanut Butter Information\nEnter name of the the peanut butter");
        peanutButter01.setName(keyboard.nextLine());

        System.out.println("Enter the number of calories");
        peanutButter01.setCalories(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("Is it Crunchy? Enter 'true' or 'false'");
        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("true")) {
            peanutButter01.setIsCrunchy(true);
        } else {
            peanutButter01.setIsCrunchy(false);
        }

        // Peanut Butter Process Ends

        // Jelly Process begins
        Jelly jelly01 = new Jelly();

        System.out.println("Jelly Information\n");
        System.out.println("Enter Jelly Name");
        jelly01.setName(keyboard.nextLine());

        System.out.println("Enter number of calories");
        jelly01.setCalories(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the type of fruit jelly");
        jelly01.setType(keyboard.nextLine());

        // Jelly Process Ends 

        // Bread Process BeginsS
        System.out.println("Bottom Slice Information");

        Bread bread02 = new Bread();
        System.out.println("Enter name of the bread");
        bread02.setName(keyboard.nextLine());

        System.out.println("Number of calories");
        bread02.setCalories(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("Enter the type of bread. Must be 'Honey Wheat', 'White', 'Whole Grain', or 'Whole Wheat'");
        bread02.setType(keyboard.nextLine());

        PBJSandwich PBnJ01 = new PBJSandwich();

        System.out.println(bread01);
        System.out.println(peanutButter01);
        System.out.println(jelly01);
        System.out.println(bread02);

        System.out.println(PBnJ01);

        // Bread Process Ends

        keyboard.close();
    }

}
