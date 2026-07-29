package problems;
import java.util.Scanner;
public class largenum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A greater");
        }
        else{
            System.out.println("B greater");
        }
    }
}
