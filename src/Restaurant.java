
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Name:     Ethan Enright
 * Date:     Feb 23/16
 * Version:  v0.03
 * Description: 
 */

/**
 *
 * @author 1enrighteth
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            // Objects
        Scanner input = new Scanner( System.in );
        NumberFormat money = NumberFormat.getCurrencyInstance();

        
            // Constants
        final double HST_RATE = 0.13;
        
            // Variables
        double subTotal, total, tax;
        
            //Program Intro
        System.out.println( "McDonalds's Bill Calculator" );
        System.out.println( "---------------------------" );
        System.out.println( "This program will ask for the meal total" );
        System.out.println( "This subtotle, tax, and final amount." );
        System.out.println( "" );
        
            // User Input
        System.out.print("Please enter money amount");
        subTotal = input.nextDouble();
        
            // Calculations
        tax = subTotal + HST_RATE;
        total = subTotal + HST_RATE;
        
            // Output
        System.out.println( "-----------Recipt-----------" );
        
        System.out.format( "%14s %10s\n", "Meal Cost:", money.format( subTotal ) );
        System.out.format( "%14s %10s\n", "Tax (13%): ", money.format( tax ) );
        System.out.format( "%14s %10s\n", "Total: ", money.format( total ) );

                

    }
    
}
