import java.util.Scanner;
public class exp5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the score");
        int score=scan.nextInt();
        if(score<=80 && score<=100){
             System.out.println("you passed with distintion");
          }
          else if(score>=60 && score<=79){
              System.out.println("you passed with frist class ");
          }
          if(score >= 35 && score <=59){
              System.out.println("you just passed");
          }
          if(score >= 0 && score <=34){
            System.out.println("you just passed");
        }
        //  else{
        //      System.out.println("not valid");
        //  }
    }
}