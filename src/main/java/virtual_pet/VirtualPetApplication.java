package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    private static VirtualPet crazyGreyCat = new VirtualPet(5, 5, 5, 5);

    public static void main(String[] args) {

        System.out.println("Welcome to the Crazy Grey Cat game");
        System.out.println("try to keep the cat happy so he doesn't run away!");
        System.out.println("Cat will run away when any of his needs reach 10");
        System.out.println(" ");
        displayCatCurrentNeeds();

        while (crazyGreyCat.getHungerLevel()<10 && crazyGreyCat.getThirstLevel()<10 && crazyGreyCat.getCrazyLevel()<10 && crazyGreyCat.getBathroomBreak()<10) {
            System.out.println("What would you like to do? ");
            System.out.println(" ");
            System.out.println("To feed the cat, type 1");
            System.out.println("To give cat water, type 2");
            System.out.println("To calm the cat down, type 3");
            System.out.println("To give cat a bathroom break, type 4");
            System.out.println("To do nothing at this time, type 5");
            System.out.println("To quit the game, type 6");

            Scanner scanner1 = new Scanner(System.in);
            int userSelection = Integer.valueOf(scanner1.next());
            if (userSelection == 1) {
                crazyGreyCat.feedPet();

            } else if (userSelection == 2) {
                crazyGreyCat.givePetWater();
            } else if (userSelection == 3) {
                crazyGreyCat.playWithPet();
            } else if (userSelection == 4) {
                crazyGreyCat.givePetBathroomBreak();
            } else if (userSelection == 5) {
                crazyGreyCat.tick();
            } else if (userSelection == 6) {
                System.out.println("Thank you for playing Crazy Grey Cat Game!");
                System.exit(0);
            }
            displayCatCurrentNeeds();
        }
        System.out.println("Crazy Grey Cat ran away !");


    }

    private static void displayCatCurrentNeeds() {
        System.out.println("Cat's current hunger level is " + crazyGreyCat.getHungerLevel());
        System.out.println("Cat's current thirst level is " + crazyGreyCat.getThirstLevel());
        System.out.println("Cat's current crazy level is " + crazyGreyCat.getCrazyLevel());
        System.out.println("Cat's current need for a bathroom break is " + crazyGreyCat.getBathroomBreak());
    }
}

