public class Parrot extends Animal implements Pet, Bird {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void fly() {
        System.out.println("Flap flap!");
    }
    public void playWith() {
        System.out.println("The parrot is playing with its toys.");
    }
}
