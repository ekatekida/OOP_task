package oop;

public class WildAnimals extends Animals{
    private boolean isPredator;

    public WildAnimals(String color, int years, String wool, int paws, boolean isPredator) {
        super(color, years, wool, paws);
        this.isPredator = isPredator;
    }
    public WildAnimals (boolean isPredator) {
        this.isPredator = isPredator;
    }
    public WildAnimals() {
    }

    @Override
    public String sound(String sound) {
        if (isPredator){
            return sound.toUpperCase() + "  HE IS VERY DANGEROUS!";}
        else{
            return sound.toLowerCase() + " Wild animal is here!";
        }
    }
}
