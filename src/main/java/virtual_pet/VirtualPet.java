package virtual_pet;

public class VirtualPet {

    private Integer hungerLevel;
    private Integer thirstLevel;
    private Integer crazyLevel;
    private Integer bathroomBreak;

    public VirtualPet(Integer hungerLevel, Integer thirstLevel, Integer crazyLevel, Integer bathroomBreak) {

        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.crazyLevel = crazyLevel;
        this.bathroomBreak = bathroomBreak;

    }

    public Integer getHungerLevel() {
        return hungerLevel;
    }


    public Integer getThirstLevel() {
        return thirstLevel;
    }


    public Integer getCrazyLevel() {
        return crazyLevel;
    }


    public Integer getBathroomBreak() {
        return bathroomBreak;
    }


    public void tick() {
        hungerLevel++;
        thirstLevel++;
        crazyLevel++;
        bathroomBreak++;

    }

    public void feedPet() {
        hungerLevel = hungerLevel - 3;
        crazyLevel++;
        bathroomBreak++;

    }

    public void givePetWater() {
        thirstLevel = thirstLevel - 3;
        bathroomBreak++;


    }

    public void playWithPet() {
        crazyLevel = crazyLevel - 3;
        hungerLevel++;
        thirstLevel++;


    }

    public void givePetBathroomBreak() {
        bathroomBreak = bathroomBreak - 3;
        crazyLevel++;


    }

    protected void displayGameObjective() {

        System.out.println("Objective: try to keep the cat happy so he doesn't run away!");
        System.out.println("Cat will run away when any of his needs reach 20");
        System.out.println(" ");
        displayCatCurrentNeeds();
        printUserInstructions();
    }


    protected void displayCatCurrentNeeds() {
        System.out.println("Cat's current hunger level is " + getHungerLevel());
        System.out.println("Cat's current thirst level is " + getThirstLevel());
        System.out.println("Cat's current crazy level is " + getCrazyLevel());
        System.out.println("Cat's current need for a bathroom break is " + getBathroomBreak());
    }

    protected static void printUserInstructions() {

        System.out.println("");
        System.out.println("1 - To feed the cat");
        System.out.println("2 - To give cat water");
        System.out.println("3 - To calm the cat down");
        System.out.println("4 - To give cat a bathroom break");
        System.out.println("5 - To do nothing at this time");
        System.out.println("6 - To quit the game");

    }

    protected boolean areNeedsTooHigh() {
        return getHungerLevel() < 20 && getThirstLevel() < 20 && getCrazyLevel() < 20 && getBathroomBreak() < 20;


    }

}