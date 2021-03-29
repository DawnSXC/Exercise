package course;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        int d=0,l=0,u=0;
        System.out.print("Please input your password:");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        if(password.length()>=10){
            for(int i=0;i<password.length();i++){
                if(Character.isDigit(password.charAt(i)))
                    d++;
                if(Character.isLowerCase(password.charAt(i)))
                    l++;
                if(Character.isUpperCase(password.charAt(i)))
                    u++;
            }
            if(d<2)
                System.out.println("Password must have two or more digits.");
            if(l<2)
                System.out.println("Password must have two or more lowercase letters.");
            if(u<2)
                System.out.println("Password must have two or more uppercase letters.");
            else
                System.out.println("Password is valid.");

        }
        else
            System.out.println("Password must have more than 10 characters.");


    }
}
