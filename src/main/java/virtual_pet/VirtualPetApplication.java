package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    private static VirtualPet crazyGreyCat = new VirtualPet(5, 5, 5, 5);

    public static void main(String[] args) {

        System.out.println("Welcome to the Crazy Grey Cat game");
        displayGameObjective();

        while (areNeedsTooHigh()) {


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
                System.out.println("Time is ticking!");
            } else if (userSelection == 6) {
                System.out.println("Thank you for playing Crazy Grey Cat Game!");
                System.exit(0);
            } else if (userSelection == 0) {
                printUserInstructions();
            }

            if (userSelection != 0) {
                crazyGreyCat.tick();
                displayCatCurrentNeeds();
            }


            System.out.println("What would you like to do now? (type 0 for user instructions)");
        }
        System.out.println("Crazy Grey Cat ran away !");


    }

    private static void displayGameObjective() {

        System.out.println("Objective: try to keep the cat happy so he doesn't run away!");
        System.out.println("Cat will run away when any of his needs reach 20");
        System.out.println(" ");
        displayCatCurrentNeeds();
        printUserInstructions();
    }


    private static void displayCatCurrentNeeds() {
        System.out.println("Cat's current hunger level is " + crazyGreyCat.getHungerLevel());
        System.out.println("Cat's current thirst level is " + crazyGreyCat.getThirstLevel());
        System.out.println("Cat's current crazy level is " + crazyGreyCat.getCrazyLevel());
        System.out.println("Cat's current need for a bathroom break is " + crazyGreyCat.getBathroomBreak());
    }

    private static void printUserInstructions() {

        System.out.println("");
        System.out.println("1 - To feed the cat");
        System.out.println("2 - To give cat water");
        System.out.println("3 - To calm the cat down");
        System.out.println("4 - To give cat a bathroom break");
        System.out.println("5 - To do nothing at this time");
        System.out.println("6 - To quit the game");

    }

    private static boolean areNeedsTooHigh() {
        return crazyGreyCat.getHungerLevel() < 20 && crazyGreyCat.getThirstLevel() < 20 && crazyGreyCat.getCrazyLevel() < 20 && crazyGreyCat.getBathroomBreak() < 20;


    }
}

