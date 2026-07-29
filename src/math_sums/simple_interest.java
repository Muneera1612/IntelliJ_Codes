package math_sums;
import java.util.Scanner;
public class simple_interest {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle :");
        int p=sc.nextInt();
        System.out.println("Enter the ratio :");
        int r=sc.nextInt();
        System.out.println("Enter the year :");
        int n=sc.nextInt();
        int si=sc.nextInt();
        if(si!=0){
            si=(p*n*r)/100;
            System.out.println(si);
        }
    }
}
