//Adriani Perez

import java.util.Scanner;

public class PBJFrontEnd {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("---------\nSandwich maker\n---------");
        System.out.println("---------Sandwhich 1---------");

        //Top Slice Process Beginds
        Bread bread01;
        System.out.println("Enter name of the bread");
        bread01.setName(keyboard.nextLine());

        System.out.println("Enter the number of calories");
        bread01.setCalories(keyboard.nextInt());

        System.out.println("Enter the type of bread. Must be 'Honey Wheat', 'White', 'Whole Grain', or 'Whole Wheat'");
        bread01.setType(BreadType.HONEYWHEAT);

        //Top Slice Process Ends

        //Peanut Butter Process Begins
        PeanutButter peanutButter01;
        System.out.println("Peanut Butter Information\n Enter name of the the peanut butter\n");
        peanutButter01.setName(keyboard.nextLine());

        System.out.println("Enter the number of calories");
        peanutButter01.setCalories(keyboard.nextInt());

        System.out.println("Is it Crunchy? Enter 'true' or 'false'");
        String choice = keyboard.nextLine();

        if (choice.equalsIgnoreCase("true")){
            peanutButter01.setIsCrunchy(true);
        }
        else{
            peanutButter01.setIsCrunchy(false);
        }

        //Peanut Butter Process Ends

        //Jelly Process begins
        Jelly jelly01;

        System.out.println("Jelly Information\n");
        System.out.println("Enter Jelly Name");
        jelly01.setName(keyboard.nextLine());

        System.out.println("Enter number of calories");
        jelly01.setCalories(keyboard.nextInt());

        System.out.println("Enter the type of fruit jelly");

        jelly01.setType(FruitType.APPLE);

        
        
        //Jelly Process Ends

        //Bread Process BeginsS
        System.out.println("Bottom Slice Information\n");

        Bread bread02;
        
        System.out.println("Enter name of the bread");
        bread02.setName(keyboard.nextLine());

        System.out.println("Number of calories");
        bread02.setCalories(keyboard.nextInt());

        System.out.println("Enter the type of bread. Must be 'Honey Wheat', 'White', 'Whole Grain', or 'Whole Wheat'");
        bread02.setType(BreadType.WHOLEGRAIN);

        PBJSandwich PBnJ01 = new PBJSandwich(bread01, peanutButter01, jelly01, bread02);

        System.out.println(bread0);

        //Bread Process Ends
    }


}
