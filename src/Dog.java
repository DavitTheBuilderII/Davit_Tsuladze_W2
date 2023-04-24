public class Dog extends Animal {
    private String breed;
    private boolean isTrained;

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }
    public boolean getIsTrained() {
        return isTrained;
    }
    public void bark() {
        System.out.println("Woof woof!");
    }
}
