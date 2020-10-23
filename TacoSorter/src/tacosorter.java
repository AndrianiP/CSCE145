

//Adriani Perez
//10/16/2020

import java.util.Scanner;


public class tacosorter{


    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int size = 10;

        String[] name = new String[size];
        double[] price = new double[size];
        
        
        System.out.println("Welcome to the Taco Sorter 3000! Enter 10 Taco names and prices and it will be sorted!");
        
        //get user taco name and taco price
        for(int i = 0; i < price.length; i++){

            System.out.println("Enter name of taco "+(i+1));
            name[i] = keyboard.nextLine();

            System.out.println("Enter price of taco "+(i+1));
            price[i] = keyboard.nextDouble();
            
            keyboard.nextLine();
        }

        //Bubble Sort
        Boolean hasSwapped = true;

        while(hasSwapped){
            hasSwapped = false;
            for(int i = 0; i < price.length - 1; i++){
                if(price[i] > price[i+1]){
                    //swap
                    double tempVal = price[i];
                    price[i] = price[i+1];
                    price[i+1] = tempVal;

                    String tempString = name[i];
                    name[i] = name[i+1];
                    name[i+1] = tempString;

                    
                    hasSwapped = true;


                }
            }

        }
        System.out.println("Sorted Tacos are");
        for(int i = 0; i < price.length;i++){
            System.out.println("Taco Prices | "+(name[i])+" "+(price[i]));
        }
    }

}
    

