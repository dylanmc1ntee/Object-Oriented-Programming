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

        System.out.println("Graph");
        System.out.println("175|                               ");
        System.out.println("150|               *               ");
        System.out.println("125|            *  *  *            ");
        System.out.println("100|         *  *  *  *  *         ");
        System.out.println(" 75|      *  *  *  *  *  *  *      ");
        System.out.println(" 50|   *  *  *  *  *  *  *  *  *   ");
        System.out.println(" 25|*  *  *  *  *  *  *  *  *  *  *");
        System.out.println("  0|*  *  *  *  *  *  *  *  *  *  *");
        System.out.println("   |--------------------------------");
        System.out.println("    2  3  4  5  6  7  8  9 10 11 12");
    }

}
