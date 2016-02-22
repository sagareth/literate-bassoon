/*
 * Name:        Ethan Enright
 * Date:        Feb 16th/ 2016
 * Version:     v0.03
 * Description: 
 *      Learning about code comments and Systeme.ost
 */
package ca.hdsb.gwss.enrightethan.u1;

public class HelloWorld {

    public static void main(String[] args) {
        // Print HELLO WORLD to the screen

        System.out.print("Hello \"This\" World\n");

        // Print HELLO WORLD to the screen
        System.out.println("Hello \"This\" World");

        // class Shortfall
        int value = 35000;
        System.out.println("A short: " + value);

        // class Payroll
        long hoursWorked = 40;
        double payRate = 10.0, taxRate = 0.10;
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("pay Amount  : " + (hoursWorked * payRate));
        System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate));

        // Declare Variable Names
        String firstname;
        int mynum1, mynum2, mynum3, mynum4;
        double mydecimal;

        // Assign values to our variables
   
        firstname = "Ethan";
        mynum1 = 15;
        mynum2 = 04;
        mynum3 = 29;
        mynum4 = 2000;
        mydecimal = 3.14;

        // Display the information to the screen
        System.out.println (mynum1);
        System.out.println (firstname);

        // Make some sense of our data and properly 
        // display to the user
        System.out.println ("My name is: "+ firstname);
        System.out.println ("I'm: " + mynum1); 	
        System.out.println ("I was born on: " + mynum2 + "/" + mynum3 + "/" + mynum4); 	

        System.out.println (" Most people that are mathmatitions all know " + 
            "about pie " + mydecimal); 	

        System.out.println ("The third number is: " + mynum3 + 
            " and my fourth number is: " + mynum4); 	

        System.out.println ("My name is: " + firstname + 
            " and my favourite number is: " + mynum3); 
        
        //1. data types are important
        //2. "double" will show the answer below instead of just 2
        int x = 9;
        int y = 2;
        double answer = (double)x / y;
        System.out.println( answer );
        
        System.out.println(x + y + "=" + x + "+" + y);
        System.out.println(x + "+" + y + "=" + (x + y));
        
        //3. Integer Division: Quotien + Remainder!
        System.out.println( x / y );   // < will divide but with no remainder
        System.out.println( x % y );  // < will give you the remainder
        System.out.println( x * y );
        System.out.println( x + y );
        System.out.println( x - y );
        
        // Math Class
        System.out.println( Math.sqrt( 25 ) );
        System.out.println( Math.abs( -3 ) );
        System.out.println( Math.abs( 3 ) );
        System.out.println( Math. pow( 2, 4 ) );
        System.out.println( Math.round( 1.23456 ) );
        System.out.println( Math.ceil( 1.23456 ) );      //Rounds Up
        System.out.println( Math.floor( 1.23456 ) );    //Rounds down
      
       
        
     
    }

}
