
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Name:        Ethan Enright
 * Date:        Feb 19/16
 * Version:     v0.01
 * Descrption: 
 *
 */

/**
 *
 * @author 1enrighteth
 */
public class DaysToHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            //Constants
        final int HOURS_IN_A_DAY = 24;
        
            //Objects
        Scanner input = new Scanner( System.in );
        
            //Variables
        int hours, years,days;
        
            //User Input
        System.out.print("Please enter the amount of hours: ");
        hours = input.nextInt();
        
            //Calculations
        days = hours / HOURS_IN_A_DAY;
        hours = hours % HOURS_IN_A_DAY;
        System.out.format( "%14s %10s + %10s\n", "Day(s) + Hours", days, hours );
        
    }
    
}
