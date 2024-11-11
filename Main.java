package oop;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Animals();
        cat.setColor("grey");
        cat.setYears(5);
        cat.setPaws(4);
        System.out.println("Cat: "+cat.sound("MYAW!"));

        Animals dog = new Animals();
        System.out.println("Dog: "+dog.sound("Woof!"));

        Animals mouse = new Animals("white", 1, "short", 4);
        mouse.sound();
        System.out.print("mouse is here!");

        Kids kitten = new Kids(3);
        System.out.println("Kitten: "+kitten.sound("myaw!"));

        WildAnimals lion = new WildAnimals(true);
        System.out.println("Lion: "+lion.sound("rrr"));
        WildAnimals monkey = new WildAnimals(false);
        System.out.println("Monkey: "+monkey.sound("u ha ha!"));

        Pets fish = new Pets(false, false);
        System.out.println("Fish: "+fish.sound("say smth!"));
        Pets catBarsik = new Pets("black", 3, "long", 4, false, true);
        System.out.println("BARSIK is my cat. he is "+catBarsik.getColor()+". He is "+catBarsik.getYears()+". he can say "+catBarsik.sound("MYAW!!"));
    }
}

//output:
//Cat: MYAW!
//Dog: WOOF!
//UUUUU!mouse is here!Kitten: myaw!
//Lion: RRR  HE IS VERY DANGEROUS!
//Monkey: u ha ha! Wild animal is here!
//Fish: THIS ANIMAL CANNOT SPEAK!
//BARSIK is my cat. he is black. He is 3. he can say myaw!!

