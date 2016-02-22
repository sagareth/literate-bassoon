/*
 * Name:     Ethan Enright
 * Date:     Feb 19/16
 * Version:  v0.02
 * Description: 
 *           This program will Calculate the perimiter and area of any rectangle 
*/


/**
 *
 * @author 1enrighteth
 */
public class AreaPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int width = 2;
        int length = 3;
        
        System.out.println( "The length of the rectangle is " + length );
        System.out.println( "The width of the rectangle is " + width );
        
        double Perimeter = width + length + width + length ;
        
        double Area = width * length ;
        
        System.out.println( "The perimeter of your given rectangle is " + Perimeter );
        
        System.out.println( "The area of your given rectangle is " + Area );
        
        
    }
    
}
