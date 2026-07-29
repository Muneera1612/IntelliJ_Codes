package math_sums;

import java.util.Scanner;

public class HarshathNo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int last=num%10;
            sum+=last;
            num/=10;
        }
        //int a=num/2;
        if(temp%sum==0){
            System.out.println("Harshath No");
        }
        else{
            System.out.println("Not a Harshath No");
        }
    }

}
