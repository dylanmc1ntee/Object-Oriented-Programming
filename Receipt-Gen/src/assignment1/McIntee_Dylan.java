package assignment1;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

// start of class
public class McIntee_Dylan{

    public static void main(String[] args) {

        // print the intro line
        System.out.println("******************************");
        System.out.println("****** S store ***************");
        System.out.println("******************************");

        Random random = new Random(); // creates the random
        Scanner scan = new Scanner(System.in); // creates the scanner
        String itemName;
        double totalPrice = 0.0;
        int numItems = 0;
        final double TAX = 1.30; // TAX will always be 30 percent

        System.out.print("receipt number      ");
        int rNum = random.nextInt(1000) + 1000; // gets a random num between 1000-1999
        System.out.println(rNum);

        int rMonth = random.nextInt(12); // gets a random num between 0-11
        int rDay = random.nextInt(28) + 1; // gets a random num between 1-28
        int rYear = random.nextInt(200) + 1900; // gets a random num between 1900-2099

        /* The following if else loops check to see 
         what month you have randomly generated */
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
        itemName = scan.nextLine(); // scans for item name

        // while the user does not enter DONE
        while (!(itemName.equals("DONE"))) {

            System.out.print("Write price ");
            double curItem = scan.nextDouble(); // scans for next price
            scan.nextLine();
            
            // if it is food do not add the tax
            if(itemName.equals("Food") || itemName.equals("food")) { 

                numItems++;
                // makes first letter uppercase 
                String upperCaseName = itemName.substring(0, 1).toUpperCase() + itemName.substring(1);
                System.out.print("Item number " + numItems + " " + upperCaseName + " ");
                double updatedPrice = Math.round(curItem);
                totalPrice += updatedPrice;
                System.out.format("%.1f\n", updatedPrice);

            }
            else {

                numItems++;
                // makes first letter uppercase 
                String upperCaseName = itemName.substring(0, 1).toUpperCase() + itemName.substring(1);
                System.out.print("Item number " + numItems + " " + upperCaseName + " ");
                double updatedPrice = (Math.round(curItem * TAX)); // adds the tax
                totalPrice += updatedPrice;
                System.out.format("%.1f\n", updatedPrice);

            }

            System.out.print("Write item name ");
            itemName = scan.nextLine(); // scans for next item
        }

        System.out.println(numItems + " items      total " + totalPrice); // concluding statement

        // prints final lines and closes scanner
        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");
        scan.close();
    }
}