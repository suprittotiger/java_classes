import java.util.Scanner;
public class exp5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the score");
        int score=scan.nextInt();
        if(score<50){
             System.out.println("you needd to imporve");
          }
          else if(score>=50 && score<70){
              System.out.println("great job");
          }
          if(score >= 70){
              System.out.println("excelent job ");
          }
    }
}