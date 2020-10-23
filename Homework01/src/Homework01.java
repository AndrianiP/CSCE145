package src;

//Adriani Perez
//09/25/2020

import java.util.Scanner;
import java.util.Random;


public class Homework01{

    public static void main(String[] args) {

        int Score0 = 0;
        int Score1 = 0;
        
        //RockVal = 1;
        //PaperVal = 2;
        //ScissorsVal = 3;

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < 3; i++){
            System.out.println("\n"+i+"\n");

            int compChoice = r.nextInt(2) + 1;

            System.out.println("Pick either 'Rock', 'Paper', or 'Scissors'.");

            String userChoice = keyboard.next();
            System.out.println("\n");

            //Compares the users choice to the computer choice when rock, paper, and scissors are given a value of 1, 2, 3
            switch(userChoice.toUpperCase()){
                case "ROCK":
                System.out.println("You picked Rock");
                    if (compChoice == 1){
                        System.out.println("The computer choose Rock");
                        System.out.println("Its a tie");
                    }
                    if (compChoice == 2){
                        
                        System.out.println("The computer choose Paper. You lost!");
                        Score1++;
                    }
                    if (compChoice == 3){
                        System.out.println("The comuter choose Scissors. You win!");
                        Score0++;
                    }
                    System.out.println("Your Score: "+Score0);
                    System.out.println("Comp Score: "+Score1);
                    break;
                    
                case "PAPER": 
                    System.out.println("You picked Paper");
                    if (compChoice == 1){
                        System.out.println("The computer choose Rock. You won!");
                        Score0++;

                    }
                    if (compChoice == 2){
                        
                        System.out.println("The computer choose Paper.");
                        System.out.println("Its a tie");
                    }
                    if (compChoice == 3){
                        System.out.println("The comuter choose Scissors. You Lost!");
                        Score1++;
                    }
                    System.out.println("Your Score: "+Score0);
                    System.out.println("Comp Score: "+Score1);
                    break;

                case "SCISSORS": 
                    System.out.println("You picked Scissors");

                    if (compChoice == 1){
                        System.out.println("The computer choose Rock. You Lost!");
                        Score1++;

                    }
                    if (compChoice == 2){
                        
                        System.out.println("The computer choose Paper. You win!");
                        Score0++;
                    }
                    if (compChoice == 3){
                        System.out.println("The comuter choose Scissors.");
                        System.out.println("Its a tie");
                    }

                    System.out.println("Your Score: "+Score0);
                    System.out.println("Comp Score: "+Score1);
                    break;

                default:
                    System.out.println("You forfeited one round to your oppenent. Pick one of the three choices this time");
                    Score1++;
                    System.out.println("Your Score: "+Score0);
                    System.out.println("Comp Score: "+Score1);
                    
            
            }
            //Checking if i == 2 because the counter starts at 0 instead of 1
            if (i == 2){
                if (Score0 > Score1){
                    System.out.println("Congratulations you won!");
                }
                if (Score0 < Score1){
                    System.out.println("Oof that sucks, you lost!");
                }
                if (Score0 == Score1){
                    System.out.println("The match ended in a tie!");
                }
                System.out.println("Do you want to play again, Yes or No?");
                userChoice = keyboard.next();
                
                switch(userChoice.toUpperCase()){
                    case "YES":
                    //starts the whole for loop over again since when the loop is finished it adds plus 1 to i
                    // i then starts at 0 when the loop begins again
                        i = -1;
                        Score0 = 0;
                        Score1 = 0;
                        break;
                    case "NO":
                        System.out.println("Thanks for playing!");
                        break;
                    default:
                        System.out.println("Pick Yes or No next time");
                        
                }

                keyboard.close();

            }


        }
    }
}
