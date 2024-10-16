package assignment2;

public class Dice {
    
    private Die die1 = new Die();
    private Die die2 = new Die();

    public Dice(){
        this.die1.setFaceValue(1);
        this.die2.setFaceValue(1);
    }

    public int getFaceValue(){
        return this.die1.getFaceValue() + this.die2.getFaceValue();
    }

    public void roll(){
        this.die1.roll();
        this.die2.roll();
    }
}
