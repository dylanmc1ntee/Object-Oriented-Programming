package assignment2;

public class Mcintee_Dylan {
    
    public static void main(String[] args){
        Dice mainDice = new Dice();
        int[] values = new int[11];

        for(int i = 0; i < 1000; i++){
            mainDice.roll();
            values[mainDice.getFaceValue() - 2]++;
        }

        for(int i = 0; i < values.length; i++){
            System.out.println("Number of " + (i+2) + "s are " + values[i]);
        }
    }

}
