//import stuff here!
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;

//Your code here
public class Program6{
    private static final DecimalFormat df = new DecimalFormat("0.000");
    public static void main (String[] args){
        double Radius = 0.0;
        double area = 0.0;
        double diameter = 0.0;
        double circumference = 0.0;
        final double pi = 3.14159;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        Radius = myObj.nextDouble();
        
        
        area = pi*(Radius*Radius);
         diameter = 2*Radius;
         circumference = 2*pi*Radius; 
        
         
        System.out.println("The Radius of a circle is "+Radius);
        System.out.println("The Diameter of a circle = "+ diameter);
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("The Area of a circle = "+ df.format(area));
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.println("The Circumference of the circle = "+ df.format(circumference));
    }
}
//Paste console output below:
/*


*/
