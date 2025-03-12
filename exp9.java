import java.util.Scanner;
public class exp7{
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        if(num>=10){
            System.out.println("the number is greater then 10!");
        }
        else{
             System.out.println("the given number is not greater then 10!");
        }
     }
}