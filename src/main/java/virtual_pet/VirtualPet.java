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

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public Integer getThirstLevel() {
        return thirstLevel;
    }

    public void setThirstLevel(Integer thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public Integer getCrazyLevel() {
        return crazyLevel;
    }

    public void setCrazyLevel(Integer crazyLevel) {
        this.crazyLevel = crazyLevel;
    }

    public Integer getBathroomBreak() {
        return bathroomBreak;
    }

    public void setBathroomBreak(Integer bathroomBreak) {
        this.bathroomBreak = bathroomBreak;
    }


    public void tick() {
        hungerLevel++;
        thirstLevel++;
        crazyLevel++;
        bathroomBreak++;


    }

    public void feedPet() {
        hungerLevel = hungerLevel - 2;
        thirstLevel++;
        crazyLevel++;
        bathroomBreak++;
        tick();
    }

    public void givePetWater() {
        thirstLevel = thirstLevel - 2;
        bathroomBreak++;
        tick();

    }

    public void playWithPet() {
        hungerLevel = hungerLevel + 1;
        thirstLevel = thirstLevel + 1;
        crazyLevel = crazyLevel - 2;
        tick();
    }

    public void givePetBathroomBreak() {
        bathroomBreak = bathroomBreak - 2;
        hungerLevel++;
        thirstLevel++;
        tick();

    }

}