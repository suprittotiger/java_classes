import java.util.Scanner;

class max{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       System.out.println("enter the number");
       int num1=scanner.nextInt();
        System.out.println("enter the number");
       int num2=scanner.nextInt();
        System.out.println("enter the number");
       int num3=scanner.nextInt();
      int max=num1;
      if(max<num2){
         max=num2;
      }
      if(max<num3){
         max=num3;
      }
    System.out.println("max number is:"+max);
    }
}