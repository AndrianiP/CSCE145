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

        System.out.println("Enter the type of bread. Must be 'Honey Wheat', 'White', 'Whole Grain', or 'Whole Wheat'");
        String breadType01 = keyboard.nextLine();
        switch (breadType01.toLowerCase()) {
            case "honey wheat":
                    bread01.setType("honey wheat");
                break;
            case "white":
                    bread01.setType("white");
                break;
            case "whole grain":
                    bread01.setType("whole grain");
                break;

            case "whole wheat":
                    bread01.setType("whole wheat");
                break;
            default:
                    bread01.setType("white");
                break;
        }
        bread01.setType(keyboard.nextLine());
        // Top Slice Process Ends

        // Peanut Butter Process Begins
        PeanutButter peanutButter01 = new PeanutButter();
        System.out.println("\nPeanut Butter Information\nEnter name of the the peanut butter");
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

        System.out.println("\nJelly Information");
        System.out.println("Enter the name of the jelly'");
        jelly01.setName(keyboard.nextLine());
        

        System.out.println("Enter number of calories");
        jelly01.setCalories(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the type of fruit jelly 'Apple', 'Blueberry', 'Grape', 'Strawberry', or 'Tomato'");
        String jellyType01 = keyboard.nextLine();

        switch (jellyType01.toLowerCase()) {
            case "apple":
                    jelly01.setType("apple");
                break;
            case "blueberry":
                    jelly01.setType("blueberry");
                break;
            case "grape":
                    jelly01.setType("grape");
                break;

            case "strawberry":
                    jelly01.setType("strawberry");
                break;

            case "tomato":
                    jelly01.setType("tomato");
                break;

            default:
                    jelly01.setType("grape");
                break;
        }

        // Jelly Process Ends 

        // Bread Process BeginsS
        System.out.println("\nBottom Slice Information");

        Bread bread02 = new Bread();
        System.out.println("Enter name of the bread");
        bread02.setName(keyboard.nextLine());

        System.out.println("Number of calories");
        bread02.setCalories(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("Enter the type of bread. Must be 'Honey Wheat', 'White', 'Whole Grain', or 'Whole Wheat'");
        String breadType02 = keyboard.nextLine();
        switch (breadType02.toLowerCase()) {
            case "honey wheat":
                    bread02.setType("honey wheat");
                break;
            case "white":
                    bread02.setType("white");
                break;
            case "whole grain":
                    bread02.setType("whole grain");
                break;

            case "whole wheat":
                    bread02.setType("whole wheat");
                break;
            default:
                    bread02.setType("white");
                break;
        }

        PBJSandwich PBnJ01 = new PBJSandwich();
        PBnJ01.setTopSlice(bread01.getName(), bread01.getCalories(), bread01.getType());
        PBnJ01.setPeanutButter(peanutButter01.getName(), peanutButter01.getCalories(), peanutButter01.getIsCrunchy());
        PBnJ01.setJelly(jelly01.getName(), jelly01.getCalories(), jelly01.getType());
        PBnJ01.setBottomSlice(bread02.getName(), bread02.getCalories(), bread02.getType());

        System.out.println(bread01);
        System.out.println(peanutButter01);
        System.out.println(jelly01);
        System.out.println(bread02);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println(PBnJ01);

        // Bread Process Ends

        System.out.println("---------Sandwhich 2---------");

        // Top Slice Process Beginds
        Bread bread03 = new Bread();
        System.out.println("Enter name of the bread");
        bread03.setName(keyboard.nextLine());

        System.out.println("Enter the number of calories");
        bread03.setCalories(keyboard.nextInt());
        keyboard.nextLine();
        

        System.out.println("Enter the type of bread. Must be 'Honey Wheat', 'White', 'Whole Grain', or 'Whole Wheat'");
        String breadType03 = keyboard.nextLine();
        switch (breadType03.toLowerCase()) {
            case "honey wheat":
                    bread03.setType("honey wheat");
                break;
            case "white":
                    bread03.setType("white");
                break;
            case "whole grain":
                    bread03.setType("whole grain");
                break;

            case "whole wheat":
                    bread03.setType("whole wheat");
                break;
            default:
                    bread03.setType("white");
                break;
        }
        // Top Slice Process Ends

        
        // Peanut Butter Process Begins
        PeanutButter peanutButter02 = new PeanutButter();
        System.out.println("\nPeanut Butter Information\nEnter name of the the peanut butter");
        peanutButter02.setName(keyboard.nextLine());

        System.out.println("Enter the number of calories");
        peanutButter02.setCalories(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("Is it Crunchy? Enter 'true' or 'false'");
        String choice2 = keyboard.nextLine();

        if (choice2.equalsIgnoreCase("true")) {
            peanutButter02.setIsCrunchy(true);
        } else {
            peanutButter02.setIsCrunchy(false);
        }

        // Peanut Butter Process Ends

        // Jelly Process begins
        Jelly jelly02 = new Jelly();

        System.out.println("\nJelly Information");
        System.out.println("Enter Jelly Name");
        jelly02.setName(keyboard.nextLine());

        System.out.println("Enter number of calories");
        jelly02.setCalories(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Enter the type of fruit jelly 'Apple', 'Blueberry', 'Grape', 'Strawberry', or 'Tomato'");

        //"Apple", "Blueberry", "Grape", "Strawberry", or "Tomato"
        String jellyType02 = keyboard.nextLine();
        switch (jellyType02.toLowerCase()) {
            case "apple":
                    jelly02.setType("apple");
                break;
            case "blueberry":
                    jelly02.setType("blueberry");
                break;
            case "grape":
                    jelly02.setType("grape");
                break;

            case "strawberry":
                    jelly02.setType("strawberry");
                break;

            case "tomato":
                    jelly02.setType("tomato");
                break;

            default:
                    jelly02.setType("grape");
                break;
        }

        // Jelly Process Ends 

        // Bread Process BeginsS
        System.out.println("\nBottom Slice Information");

        Bread bread04 = new Bread();
        System.out.println("Enter name of the bread");
        bread04.setName(keyboard.nextLine());

        System.out.println("Number of calories");
        bread04.setCalories(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("Enter the type of bread. Must be 'Honey Wheat', 'White', 'Whole Grain', or 'Whole Wheat'");
        String breadType04 = keyboard.nextLine();
        switch (breadType04.toLowerCase()) {
            case "honey wheat":
                    bread04.setType("honey wheat");
                break;
            case "white":
                    bread04.setType("white");
                break;
            case "whole grain":
                    bread04.setType("whole grain");
                break;

            case "whole wheat":
                    bread04.setType("whole wheat");
                break;
            default:
                    bread04.setType("white");
                break;
        }

        // Bread Process Ends
        PBJSandwich PBnJ02 = new PBJSandwich();
        PBnJ02.setTopSlice(bread03.getName(), bread03.getCalories(), bread03.getType());
        PBnJ02.setPeanutButter(peanutButter02.getName(), peanutButter02.getCalories(), peanutButter02.getIsCrunchy());
        PBnJ02.setJelly(jelly02.getName(), jelly02.getCalories(), jelly02.getType());
        PBnJ02.setBottomSlice(bread04.getName(), bread04.getCalories(), bread04.getType());

        System.out.println("+++++++++++++++++++++++++++++++++\nSandwhich One\n+++++++++++++++++++++++++++++++++");
        System.out.println(PBnJ01);
        System.out.println("+++++++++++++++++++++++++++++++++\nSandwhich Two\n+++++++++++++++++++++++++++++++++");
        System.out.println(PBnJ02);

        System.out.println("Are the sandwhiches the same? "+PBnJ01.equals(PBnJ02));

        keyboard.close();
    }

}
