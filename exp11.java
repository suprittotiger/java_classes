import java.util.Scanner;
public class exp16{
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=scan.nextInt();
        System.out.println("enter the num2");
        int num2=scan.nextInt();
        if(num1>num2){
            System.out.println("num1 is greater");
        }
        else if(num2>num1){
             System.out.println("num2 is greater!");
        }
        else{
             System.out.println("num1 and num2 is greater");
        }
     }
}