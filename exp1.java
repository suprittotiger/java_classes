import java.util.Scanner;
public class exp1{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the marks");
      int marks = scan.nextInt();
       if(marks>35){
        System.out.println("your are passed");
       }
       else{
          System.out.println("your are failed");
       }
    }
}