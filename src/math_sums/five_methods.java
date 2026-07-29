package math_sums;
import java.util.Scanner;

public class five_methods {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n :");
        int num=sc.nextInt();
        int count=0;
        System.out.println("Enter the numbers x:");
        for(int i=1;i<=num;i++){
            int x=sc.nextInt();
            if(num%2==0){
                count=count+1;
            }
            if(num%2!=0){
                count=count+1;
            }
            if(num>0){
                count=count+1;
            }
            if(num<0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
