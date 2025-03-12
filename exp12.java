import java.util.Scanner;
public class exp8{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the gender frist letter ");
        char gender=scan.next().charAt(0);
        if(gender=='M'||gender=='m'){
             System.out.println(" male");
        }
        else  if(gender=='f'|| gender=='F'){
             System.out.println(" female");
        }
        if(gender=='o'|| gender == 'O'){
             System.out.println("Other");
        }
    }
}