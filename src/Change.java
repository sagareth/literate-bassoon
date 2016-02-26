/*
 * Name:        Ethan Enright
 * Date:        Feb 19/16
 * Version:     v0.01
 * Descrption: 
 *              This program will show you the least amount of coins needed 
 *              to make change
 */

/**
 *
 * @author 1enrighteth
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Quarter = 25;
        int Dimes = 10;
        int Nickles = 5;
        int Pennies = 1;
        int Change = 212;
        
        System.out.println( "Quarters:" );
        System.out.println( Change / Quarter  );
        System.out.println( "Dimes:" );
        System.out.println( "Nickles:" );
        System.out.println( "Pennies:" );
        
        
        System.out.format("%-10s %8s %8s", "Team", "Wins", "Losses\n");
        System.out.format("%-10s %8s %8s", "Jaguars", "10", "5\n");
        System.out.format("%-10s %8s %8s", "Cheetahs", "14", "1\n");
        System.out.format("%-10s %8s %8s", "Panthers", "8", "7\n");
        System.out.format("%-10s %8s %8s", "Penguins", "4", "11\n");
        
       
        
    }
    
}
