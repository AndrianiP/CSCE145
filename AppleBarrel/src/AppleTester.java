//Adriani Perez
//10/23/2020

import java.util.Scanner;

public class AppleTester {
    public static void main(String[] args){
        System.out.println("Welcome to apple tester\n\nCreating Default apple");
        Apple apple01 = new Apple();
        System.out.println("Printing default apple values");
        System.out.println(apple01);
        System.out.println("\n Creating another apple \n Setting the new apple's values to the following, valid values");
        Apple apple02 = new Apple("Granny Smith", 0.75, 0.99);
        System.out.println(apple02);

        System.out.println("\ncorrupt apple coming up\n");

        Apple apple03 = new Apple();
        apple03.setType("Ipad");
        apple03.setWeight(2.6);
        apple03.setPrice(-200);
        System.out.println("New Apple that is corrupt. Should not chaneg from default values");
        System.out.println(apple03);
        System.out.println("\nChecking out the first and last apples have same values");
        
        System.out.println(apple01.equals(apple03));


    }
}
