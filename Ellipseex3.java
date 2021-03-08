package course;
import java.util.Scanner;
public class Ellipseex3 {
    public static void main(String[] args){
        final double PI=3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length for the semi-major axis a: ");
        double a = input.nextDouble();
        System.out.print("Enter the length for the semi-minor axis b: ");
        double b = input.nextDouble();
        if(a>0&&b>0&&a>b){

            double area = (double)(PI*a*b);
            double e =(double)( Math.sqrt(1-(Math.pow(b,2)/Math.pow(a,2))));
            System.out.println("The area of this ellipse is "+ area);
            System.out.println("The eccentricity of this ellipse is"+ e);
        }
        else if(a>0&&b>0&&a<b){
            System.out.println("Error: semi-major axis must be longer than semi-minor axis");
        }
        else if(a<=0&&b>0){
            System.out.println("Error: semi-major axis length must be > 0");
        }
        else if(a>0&&b<=0){
            System.out.println("Error: semi-minor axis length must be > 0");

        }
        else if(a<=0&&b<=0){
            System.out.println("Error:  semi-major axis length and semi-minor axis length must be > 0");
        }
    }

}
