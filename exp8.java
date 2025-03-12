import java.util.Scanner;
public class exp8{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the charecter");
        char gender=scan.next().charAt(0);
        if(gender=='M'||gender=='m'){
             System.out.println("yes he is male");
        }
    }
}