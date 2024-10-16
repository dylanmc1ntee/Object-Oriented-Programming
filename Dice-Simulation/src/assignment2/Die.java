package assignment2;
import java.util.Random;

public class Die {
    
    private int faceValue;

    public Die(){
        faceValue = 1;
    }

    public int getFaceValue(){
        return this.faceValue;
    }

    public void setFaceValue(int newVal){
        this.faceValue = newVal;
    }

    public void roll(){
        Random random = new Random(); // creates the random
        this.faceValue = random.nextInt(7); // gets a random num between 0-7
    }
}
