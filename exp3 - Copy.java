import java.util.Scanner;
public class exp3{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the number");
       int num=scan.nextInt();
       int a=3;
       int b=5;
       if(num%3==0 && num%5==0){
         System.out.println("number is divisiable");
       }
       else {
        System.out.println("number is not divisiable");
       }
    }
}