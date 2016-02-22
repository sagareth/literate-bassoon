/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        double x = 10.00;
        double Bill = x * 1.13;
        double HST = x * 0.13;
        double Tip = x * 1.10;
        double toatle = (x * 1.10) * 1.13 ;
        
        System.out.println( "Your meal today cost you $" + x );
        System.out.println( "Toatle HST tax is $" + HST );
        System.out.println( "With a much appreciated 10% tip amount of $" + Tip );
        System.out.println( "Your toatle for todays meal is $" + toatle );
        
        System.out.println(" ");
        System.out.println( "Hope to see you again soon thank you for comeing " );
        
    }
    
}
