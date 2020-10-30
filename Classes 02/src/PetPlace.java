//Adriani Perez

import java.util.Scanner;

public class PetPlace {

    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        Pet pet01 = new Pet();
        System.out.println(pet01);

        Pet pet02 = new Pet("Juanito", 15, 138, PetType.OWL);
        System.out.println(pet02);

        System.out.println("Enter Value for name of your pet");
        String petName01 = keyboard.nextLine();

        System.out.println("Enter Value for age of your pet");
        int petAge01 = keyboard.nextInt();

        
        Pet pet03 = new Pet(petName01, petAge01, 15, PetType.DOG);
        System.out.println(pet03);

        pet02.giveCompliment();
        pet03.giveCompliment(2);

        Pet pet04 = Pet.createNewPet(PetType.HAMSTER);
        System.out.println(pet04);

        Pet pet05 = Pet.clonePet(pet02);
        System.out.println(pet05);
        System.out.println(pet02.equals(pet05));
        System.out.println(pet02 == pet05);
        keyboard.close();
    }
    
}
