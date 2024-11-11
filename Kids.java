package oop;

public class Kids extends Animals{
    private int months;
    public Kids(int months) {
        this.months = months;
    }
    public Kids() {
    }

    public Kids(String color, int years, String wool, int paws, int months) {
        super(color, years, wool, paws);
        this.months = months;
    }

    @Override
    public String sound(String sound) {
        return sound.toLowerCase();
    }

    public void sound() {
        System.out.print("uuuuu!");
    }

}
