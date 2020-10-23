//Adriani Perez
//09/18/2020

import java.util.Scanner;
import java.util.Random;

public class Adventure
{

    public static void main(String[] args){
    

        final Scanner keyboard = new Scanner(System.in);
        int choice;

        System.out.println("\n********************************************************************************************************************************************************\n");
        System.out.println("You wake up in your motel room after a long road trip to be greeted by a hometown friend named Dave standing over you. You have not seen him 10 years.");
        System.out.println("\n********************************************************************************************************************************************************\n");

        System.out.println("\nDave: Good morning! Wait... I forgot your name could you please tell me again? After the concussion I forgot so many things.\n");
        
        int pHealth = 15;
        double pATK = 3;
        double pArmor = 0;
        double pSpeed = 0.5;
        Random r = new Random();

        final String pName = keyboard.next();

        System.out.println("You respond with: My name is " +pName + ", how could you not remember that?");
        System.out.println("\nDave: Ah its all coming back to me, how could I forget about you "+ pName +"! "+ "We are glad you came back to Kanto!\n");
        System.out.println("==========================================================================================================================================================\n");

        System.out.println("Choose option 1 or 2.\n");
        System.out.println("1. Why?\n");
        System.out.println("2. I know!\n");
        
        choice = keyboard.nextInt();
        while (choice != 1 && choice != 2){
        
            System.out.println("Choose option 1 or 2.\n");
            choice = keyboard.nextInt();
        }
            if (choice == 1){
            
                System.out.println(pName+": Wait why? What is going on you seem overly happy...\n");

                    System.out.println("Dave: Have you not seen the news recently?\n" + pName +": Nope. I just came back to visit. I have been missing this place quite a bit." );
                    System.out.println("Dave: Well currently we are being threatened by robotic family of flying orcas called Forcas. I thought you came here to help... \n" + pName+": Ahh okay.");
                    System.out.println("Dave: So are you going to help us or not?\n");

                    System.out.println("==========================================================================================================================================================\n");
                    //First decision
                        System.out.println("1. Do not help\n");
                        System.out.println("2. Help\n");
    
                        System.out.println("Choose option 1 or 2.\n");
                        choice = keyboard.nextInt();
                        while (choice != 1 && choice != 2){
                        
                            System.out.println("Choose option 1 or 2.\n");
                            choice = keyboard.nextInt();
                        }
                        System.out.println("==========================================================================================================================================================\n");
                        if ( choice == 1){
                        
                            System.out.println("\nDave: *pulls out a knife and points it towards your direction");
                            System.out.println("Dave: Get out of here we do not need you and we dont want you here!\n");

                            //Ending 1
                            System.out.println("You get all your belongings and hop into your car and leave town not to be seen again.");
                            System.exit(0);

                        }
                    }

                System.out.println(pName+": Yeah, of course I would want to help the community that helped raise me.\n");
                System.out.println("==========================================================================================================================================================\n");
                    
                    System.out.println("You walk out of your motel to see a table of weapons and armor\n");
                    System.out.println("Dave: Okay " +pName + " since you are going to be helping, take a look at one you like!\n");

                    final String sSword = "Sword";
                    final String sChest = "Chest";
                    final String sBoots = "Boots";

                    final double Sword = 4;
                    final double Chest = 5;
                    final double Boots = 0.2;

                    String inspect = "";

                    Boolean stat = true;
                            while (stat == true){
                            //2nd decision
                                System.out.println("Which one would you like to take a look at?\n");
                                System.out.println("Sword\n");
                                System.out.println("Chest\n");
                                System.out.println("Boots\n");
                                System.out.println("==========================================================================================================================================================\n");
                  
                                inspect = keyboard.next();
                                //Checks if user typed in sword
                                if (inspect.equalsIgnoreCase(sSword)){
                                
                                
                                //Shows stats that will be added if user picks the sword
                                System.out.println(pName+"'s Stats");
                                System.out.println("\nHealth: " +pHealth);
                                System.out.println("\nAttack: " + pATK + " + " + Sword);
                                System.out.println("\nArmor: " +pArmor);
                                System.out.println("\nSpeed: " +pSpeed);

                                }
                                //Checks if user typed in Chest
                                else if (inspect.equalsIgnoreCase(sChest)){
                                
                               //Shows stats that will be added if user picks the chest
                                System.out.println(pName+"'s Stats");
                                System.out.println("\nHealth: " +pHealth);
                                System.out.println("\nAttack: " + pATK);
                                System.out.println("\nArmor: " +pArmor  + " + " + Chest);
                                System.out.println("\nSpeed: " +pSpeed);
                                }
                                //Checks if user typed in Boots
                                else if (inspect.equalsIgnoreCase(sBoots)){
                                
                               //Shows stats that will be added if user picks the Boots
                                System.out.println(pName+"'s Stats");
                                System.out.println("\nHealth: " +pHealth);
                                System.out.println("\nAttack: " + pATK);
                                System.out.println("\nArmor: " +pArmor);
                                System.out.println("\nSpeed: " +pSpeed   + " + " + Boots);
                                }
                                //3rd decision
                                    System.out.println("Do you want to look at another one, \"Yes\" or \"No\"?");
                                    String check = keyboard.next();
                                    
                                    //allows the player to go back and change his weapon if desired
                                    if (check.equalsIgnoreCase("Yes")){
                                    
                                        check = "";
                                        inspect = "";
                                        stat = true;
                                        continue;
                                    }
                                    stat = false;
                                    if(check.equalsIgnoreCase("No")){
                                    
                                        if (inspect.equalsIgnoreCase(sSword))
                                        {
                                            pATK = pATK + Sword;
                                        }

                                        if (inspect.equalsIgnoreCase(sChest))
                                        {
                                            pArmor = pArmor + Chest;
                                        }

                                        if (inspect.equalsIgnoreCase(sBoots))
                                        {
                                            pSpeed = pSpeed + Boots;
                                        }
                                    }
 
                            }

        System.out.println("\n" + pName + "'s Stats");
        System.out.println("\nHealth: " +pHealth);
        System.out.println("\nArmor: " +pArmor);
        System.out.println("\nAttack: " +pATK);
        System.out.println("\nSpeed: " +pSpeed);

        //Boots option storry line
            if(inspect.equalsIgnoreCase(sBoots)){
            
                System.out.println("Dave: I would not have done that if i was you " +pName+ "." + " Steve is going to be hella mad he wanted those.. Oh no here he comes!");
                System.out.println("Steve charges getting ready to strike at you while yelling");
                System.out.println("Steve: " +pName + "I NEEDED THOSE");
                //4th decision
                System.out.println("\nWhat do you do?\n" );
                System.out.println("1. Fight him! You win if you roll a 6 or less on a 16 sided die");
                System.out.println("2. You try to runaway.\n");

                choice = keyboard.nextInt();

                    if (choice == 1){
                    
                        int rInt = r.nextInt(16) + 1;
                        System.out.println("\nDice landed on: " +rInt);
                        if (rInt >= 6){
                        
                            //Ending 2
                            System.out.println("Steve smashes your face into the ground resulting in you going into a vegatative state.");
                            System.exit(0);
                            
                        }
                        else{
                            pHealth = pHealth - rInt;
                            pArmor = pArmor + 2;
                            System.out.println("You managed to defeat Steve in a fight and keep your boots. You also got some of his armor. But your health got reduced by "+rInt);
                            
                            System.out.println("\n" + pName + "'s Stats");
                            System.out.println("\nHealth: " +pHealth);
                            System.out.println("\nArmor: " +pArmor);
                            System.out.println("\nAttack: " +pATK);
                            System.out.println("\nSpeed: " +pSpeed);
                            //Ending 3
                            System.out.println("You continue to live throughout your day until you feel really sick. Turns out Steve's fingernails were filled with bacteria which entered your bloodstream\n and killed you.");
                        }
                    
                    }
                    else{
                        //Ending 4
                        System.out.println("\nYou runaway away from Steve safely but end up running into a tree and knocking yourself out");
                        System.exit(3);
                    }
            }
            if (inspect.equalsIgnoreCase(sSword)){

                //Sword option story line
                System.out.println("Dave: Great choice a sword will really come in handy taking these guys out. Follow me lets go hunt these things down!");
                System.out.println("What do you do?\n");
                System.out.println("1.Go follow Dave and Hunt down Forcas\n");
                System.out.println("2.Play around with your new sword\n");
                System.out.println("3.Decided to explore on by yourself\n");
                choice = keyboard.nextInt();

                    switch(choice){
                        case 1:
                            //5th Ending
                            System.out.println("You go with dave and kill 4 Forcas and save some potential lives like the hero you are!");
                            break;
                        case 2:
                            //6th Ending
                            System.out.println("You flip around your sword it slices your finger off making you uncapable to fight.");
                            break;
                        case 3:
                            //7th Ending
                            System.out.println("You go out and explore by yourself which lead to you killing one forca but losing your life due to bleeding out and not being able to make it back to base.");
                            break;
                        default:
                            System.out.println("Choose one of the options: 1, 2, 3");
                            break;
                    }
            
            }
        if (inspect.equalsIgnoreCase(sChest)){
            System.out.println("Nice amazing armor! You cant go wrong with some protection!");
            System.out.println("Alright I hope it fits on you! Lets go, you lead the way!");
            System.out.println("You approach a sign that reads, 'North, East, South, West'. Where do you go?\n");
            
            inspect = keyboard.next();

            switch(inspect.toUpperCase()){
                case "NORTH":
                    //8th Ending
                    System.out.println(pName+": We go north.\n You go north and you have to cross a river. Due to you having armor on you start sinking when swimming leading to your demise.\n");
                    break;
                case "EAST":
                    //9th Ending
                    System.out.println(pName+": We shall go east! After traveling 2 miles east you find a beast... The killer forca queen calls reinforcement and shoots everyones head off since they had no helmets!\n");
                    break;
                case "SOUTH":
                    //10th Ending
                    System.out.println(pName+": Alrighty south it is. Oh wow thats quick sand, I guess we will have to try to cross it.\n" + "They fall into quicksand and sink faster than normal due to the heavy armor.\n");
                    break;
                case "WEST":
                    //11th Ending
                    System.out.println(pName+": West is the best... Thats what they say, right Dave?\n" + "Dave: No " +pName+ " this is by far the worst route we could have taken!\n");
                    System.out.println("You find out later that you should have taken the boots because you are being chased by a group little goblins who continue throwing spears until you end up getting your legs sliced off");
                    break;
                default:
                    System.out.println("Choose a direction!");

            }
        }
        keyboard.close();
    } 
}
