//package TimeRemaining;

import java.util.Scanner;

public class TimeTracker {
   
public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);
		System.out.println("\nHow much time is remaining?");
		int time = keyboard.nextInt();
        keyboard.close();  


        int hour = 0;
        int minute = 0;

        hour = time / 60;
        time = time % 60;

        minute = time;

        System.out.println("\nTime Left: " +hour); System.out.println(" hour/s and " +minute); System.out.println(" minute/s left");
}


}
