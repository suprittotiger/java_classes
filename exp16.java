import java.util.Scanner;
class exp16{
    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter the number");
       int num1=scanner.nextInt();
       System.out.println("enter the number");
       int num2=scanner.nextInt();
       int max=num1;
       if(max<num2){
          max=num2;
       }
       System.out.println("max of given two number is:"+max);
    }
}