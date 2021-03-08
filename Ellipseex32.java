package course;
import java.util.Scanner;
public class Ellipseex32 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length for the semi-major axis a: ");
        double a = input.nextDouble();
        if (a <= 0) {
            System.out.println("Error: semi-major axis length must be > 0");
            System.exit(0);
        } else {
            System.out.print("Enter the length for the semi-minor axis b: ");
            double b = input.nextDouble();
            if(b<=0){
                System.out.println("Error: semi-minor axis length must be > 0");
                System.exit(0);
            }
            else{
                if(a<b){
                    System.out.println("Error: semi-major axis must be longer than semi-minor axis");
                    System.exit(0);
                }
                else{
                    double area = (double)(PI*a*b);
                    double e =(double)( Math.sqrt(1-(Math.pow(b,2)/Math.pow(a,2))));
                    System.out.println("The area of this ellipse is "+ area);
                    System.out.println("The eccentricity of this ellipse is"+ e);
                }
            }
        }
    }
}
