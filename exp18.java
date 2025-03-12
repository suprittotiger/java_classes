import java.util.Scanner;

public class GmailLogin {
    public static void main(String args[]) {
      
        String correctEmail = "user@gmail.com";
        String correctPassword = "password123";

     
        Scanner scan = new Scanner(System.in);

         
        System.out.print("Enter your Gmail ID: ");
        String email = scan.next();

         
        if (email.equals(correctEmail)) {
            
            System.out.print("Enter your Password: ");
            String password = scan.next();
 
            if (password.equals(correctPassword)) {
                System.out.println("Login Successful! Welcome to Gmail.");
            } else {
                System.out.println("Incorrect Password! Try again.");
            }
        } else {
            System.out.println("Invalid Gmail ID! Try again.");
        }

        scan.close();
    }
}
