import java.util.Scanner;
class two{
    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       System.out.print("enter the number");
       int num1=scanner.nextInt();
       System.out.print("enter the number");
       int num2=scanner.nextInt();
       System.out.print("enter the number");
       int num3=scanner.nextInt();
       int max=num1;
         if(num2>num1){
             max=num2;
         }
         else if(num3>num2){
               max=num3;
         }
         System.out.println("max of 3 number is:"+max);
    }
}