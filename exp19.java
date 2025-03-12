import java.util.Scanner;

public class MatrimonialSignup {
    public static void main(String args[]) {
         
        Scanner scan = new Scanner(System.in);

    
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

       
        System.out.print("Enter your gender (M/F): ");
        char gender = scan.next().charAt(0);

        
        if (age >= 18) {   
            if (gender == 'M' || gender == 'm') {  
                if (age >= 21) {
                    System.out.println("You are eligible for Matrimonial ");
                } else {
                    System.out.println("You are not eligible! Males must be 21 or older.");
                }
            } else if (gender == 'F' || gender == 'f') {
                System.out.println("You are eligible for Matrimonial ");
            } else {
                System.out.println("Invalid gender! Please enter M or F.");
            }
        } else {
            System.out.println("You are not eligible! Minimum age requirement is 18.");
        }

      
        scan.close();
    }
}
