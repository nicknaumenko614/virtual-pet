package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {
    private static VirtualPet crazyGreyCat = new VirtualPet(5, 5, 5, 5);

    public static void main(String[] args) {

        System.out.println("Welcome to the Crazy Grey Cat game");
        crazyGreyCat.displayGameObjective();

        while (crazyGreyCat.areNeedsTooHigh()) {


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
                VirtualPet.printUserInstructions();
            }

            if (userSelection != 0) {
                crazyGreyCat.tick();
                crazyGreyCat.displayCatCurrentNeeds();
            }


            System.out.println("What would you like to do now? (type 0 for user instructions)");
        }
        System.out.println("Crazy Grey Cat ran away !");


    }


}

