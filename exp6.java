import java.util.Scanner;
public class exp6{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the traffic light");
        String traffic = scan.next().toLowerCase();
        if(traffic.equals("red")){
            System.out.println("stop");
        }
        else if(traffic.equals("yellow")){
             System.out.println("get ready");
        }
        if( traffic.equals("green")){
             System.out.println("go");
        }
    }
}