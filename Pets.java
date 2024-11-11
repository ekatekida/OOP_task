package oop;

public class Pets extends Animals{
    private boolean isCute;
    private boolean hasSound;

    public Pets(String color, int years, String wool, int paws, boolean isCute, boolean hasSound) {
        super(color, years, wool, paws);
        this.isCute = isCute;
        this.hasSound = hasSound;
    }
    public Pets (boolean isCute, boolean hasSound) {
        this.isCute = isCute;
        this.hasSound = hasSound;
    }
    public Pets() {
    }

    @Override
    public String sound(String sound) {
        if (hasSound == false){
            return "THIS ANIMAL CANNOT SPEAK!";
        }
        else return sound.toLowerCase();
    }

    public void sound() {
        if (hasSound == false){
            System.out.println("THIS ANIMAL CANNOT SPEAK!");
        }
        else System.out.println("uuuu!");;
    }

}
