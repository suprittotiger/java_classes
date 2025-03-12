import java.util.Scanner;
public class exp13{
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();
        if(num<0){
            System.out.println("the number is negative!");
        }
        else{
             System.out.println("the given number is positive!");
        }
     }
}