package course;
import java.util.Scanner;
public class FahrenheitToCelsiua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit:");
        int fahrenheit = input.nextInt();

        double celsius =(double)( (5.0/9)*(fahrenheit - 32));
        System.out.println("Fahrenheit"+fahrenheit+" is "+celsius+" in Celsiua..");

    }
}
