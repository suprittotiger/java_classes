import java.util.Scanner;
public class exp1{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the income");
      double income = scan.nextDouble();
       if(income>=7000){
        System.out.println("your are eligable for scorlership");
       }
       else{
          System.out.println("your are not eligable for scorlership");
       }
    }
}