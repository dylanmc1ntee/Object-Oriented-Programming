package assignment2;
import java.util.Random;

public class Die {
    
    private int faceValue; // holds value of die

    public Die(){
        faceValue = 1; // defaults to 1
    }

    public int getFaceValue(){
        return this.faceValue; // returns current face value
    }

    public void setFaceValue(int newVal){
        this.faceValue = newVal; // sets face value to newVal
    }

    public void roll(){
        Random random = new Random(); // creates the random
        this.faceValue = random.nextInt(6) + 1; // gets a random num between 0-6
    }
}
