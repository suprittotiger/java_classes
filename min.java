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
        System.out.println("enter the number");
       int num4=scanner.nextInt();
      int min=num1;
      if(min>num2){
        min=num2;
      }
      if(min>num3){
         min=num3;
      }
      if(min>num4){
         min=num4;

      }
    System.out.println("max number is:"+min);
    }
}