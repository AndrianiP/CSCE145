//Adriani Perez
//09/25/2020

import java.util.Scanner;

public class TempAverage {
   
public static void main(String[] args) {

    int SIZE = 10;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("\nWelcome to Temperature Averager!");

    double[] temps = new double[SIZE];
    double sum = 0.0;

    for (int i = 0; i < temps.length; i++){
        System.out.println("Temperature for the day " +(i+1));
        temps[i] = keyboard.nextDouble();
        sum += temps[i];
    }
    
    double avg = sum / temps.length;
    System.out.println("\nThe average temperature was " +avg+ "\nThe days that were below average were" );

    for(int i = 0; i < temps.length; i++)
    {
        if(temps[i] < avg)
        {
            System.out.println("Day "+(i+1)+ " with " +temps[i]);
        }
    }
    keyboard.close();
    }
    
}
