package course;
import java.util.Scanner;
public class Ellipse {
    public static void main(String[] args){
        final double PI=3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length for the semi-major axis a: ");
        double a = input.nextDouble();
        System.out.print("Enter the length for the semi-major axis b: ");
        double b = input.nextDouble();
        double area = (double)(PI*a*b);
        double e =(double)( Math.sqrt(1-(Math.pow(b,2)/Math.pow(a,2))));
        System.out.println("The area of this ellipse is "+ area);
        System.out.println("The eccentricity of this ellipse is"+ e);

    }
}
