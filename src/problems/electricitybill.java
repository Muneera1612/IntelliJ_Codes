package problems;
import java.util.Scanner;
public class electricitybill {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the unit n:");
        int n=sc.nextInt();
        System.out.println("Enter the price p:");
        int p=sc.nextInt();
        if(n>=1 && n<=50){
            int a=n*p;
            System.out.println(a);
        }
        else if(n>50 && n<=100){
            int b=p*3;
            int c=n*b;
            System.out.println(c);
        }
        else if(n>=100){

            int d=p*6;
            int e=n*d;
            System.out.println(e);
        }
    }

}

