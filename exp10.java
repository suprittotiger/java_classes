import java.util.Scanner;
public class exp{
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age");
        int num=scan.nextInt();
        if(num>=18){
            System.out.println("yes he is eligible for vote!");
        }
        else{
             System.out.println("he is not eligible for vote!");
        }
     }
}