package assignment1;
import java.util.Scanner;
import java.util.Random;

public class McIntee_Dylan{

    public static void main(String[] args) {

        System.out.println("******************************");
        System.out.println("****** S store ***************");
        System.out.println("******************************");
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        String itemName;
        
        do {

            System.out.print("receipt number      ");
            int rNum = random.nextInt(1000) + 1000;
            System.out.println(rNum);

            int rMonth = random.nextInt(12);
            int rDay = random.nextInt(28) + 1;
            int rYear = random.nextInt(200) + 1900;

            if (rMonth == 0) {

                System.out.print("January ");
                
            } else {

                if (rMonth == 1) {

                    System.out.print("February ");
                
                } else {

                    if (rMonth == 2) {

                        System.out.print("March ");
                    
                    } else {
    
                        if (rMonth == 3) {

                            System.out.print("April ");
                        
                        } else {
        
                            if (rMonth == 4) {

                                System.out.print("May ");
                            
                            } else {
            
                                if (rMonth == 5) {

                                    System.out.print("June ");
                                
                                } else {
                
                                    if (rMonth == 6) {

                                        System.out.print("July ");
                                    
                                    } else {
                    
                                        if (rMonth == 7) {

                                            System.out.print("August ");
                                        
                                        } else {
                        
                                            if (rMonth == 8) {

                                                System.out.print("September ");
                                            
                                            } else {
                            
                                                if (rMonth == 9) {

                                                    System.out.print("October ");
                                                
                                                } else {
                                
                                                    if (rMonth == 10) {

                                                        System.out.print("November ");
                                                    
                                                    } else {
                                    
                                                        if (rMonth == 11) {

                                                            System.out.print("December ");
                                                        
                                                        } else {
                                        
                                                            System.out.print("ERROR ");
                                                            
                                                        }
                                                        
                                                    }
                                                    
                                                }
                                                
                                            }
                                            
                                        }
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                }

            }

            System.out.print(rDay + " ");
            System.out.println(rYear);

            System.out.print("Write item name ");
            itemName = scan.nextLine();
        } while (!(itemName.equals("DONE")));

        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");
        scan.close();
    }
}