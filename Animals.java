package oop;

public class Animals {
    private String color;
    private int years;
    private String wool;
    protected int paws;

    public Animals(String color, int years, String wool, int paws) {
        this.color = color;
        this.years = years;
        this.wool = wool;
        this.paws = paws;
    }

    public Animals() {
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    public void sound(){
        System.out.print("UUUUU!");
    }
    public String sound(String sound){
        return sound.toUpperCase();
    }
}
