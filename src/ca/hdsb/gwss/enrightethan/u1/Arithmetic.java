/*
 * Name:    Ethan Enright
 * Date:    Feb 18/16
 * Version: v0.01
 * Description:
 *          Assignment: Arithmic.java
 */
package ca.hdsb.gwss.enrightethan.u1;

/**
 *
 * @author 1enrighteth
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 5;
        int b = 9;
        
        double sum = (a + b);
        
        double difference = (a - b);
        
        double product = a * b;
        
        double modulus = a % b;
        
        System.out.println( " The sum of \"a\" and \"b\" " );
        System.out.println(sum);
        
        System.out.println( " The difference of \"a\" and \"b\" ");
        System.out.println(difference);
        
        System.out.println( " The Product of \"a\" and \"b\" ");
        System.out.println(product);
        
        System.out.println( " The Absolute value of \"a\" and \"b\" " );
        System.out.println(modulus);
        
    }
    
}
