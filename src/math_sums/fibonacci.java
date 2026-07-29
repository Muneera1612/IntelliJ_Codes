package math_sums;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int first=0;
        int second=1;
        int n=sc.nextInt();//6
//        if(n==1){
//            //6==1
//            System.out.println("0");
//        }
//        else if(n==2){
//            //6==2
//            System.out.println("1");
//        }
        if(n>=1){
            //6>=1
            System.out.println(first);//0
        }
        if(n>=0){
            //6>=0
            System.out.println(second);//1
        }
        for(int i=3;i<=n;i++){
            //3<=6
            int next=first+second;//o+1=1
            //1+1=2
            //1+2=3
            //2+3=5
            System.out.println(next);
            //1

            first = second;
            second = next;
        }
    }
}
