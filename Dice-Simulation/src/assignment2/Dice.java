package assignment2;

public class Dice {
    
    private Die die1 = new Die(); // creates fire die
    private Die die2 = new Die(); // second one

    public Dice(){
        this.die1.setFaceValue(1); // sets face value of first die
        this.die2.setFaceValue(1); // and the second one
    }

    public int getFaceValue(){
        return this.die1.getFaceValue() + this.die2.getFaceValue(); // returns the sum of the two dies
    }

    public void roll(){
        this.die1.roll(); // rolls the first die
        this.die2.roll(); // and the second one
    }
}
