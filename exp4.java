import java.util.Scanner;
public class exp4{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the number");
       int num=scan.nextInt();
       if(num%2==0){
         System.out.println("number is even");
       }
       else {
        System.out.println("number is odd");
       }
    }
}