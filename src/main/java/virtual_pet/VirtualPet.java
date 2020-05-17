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

}