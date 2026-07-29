package Logical_sums;

import java.util.Scanner;

public class sum_EO {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int prod=1;
        while(num>0){
            int last=num%10;
            sum = sum+last;
            prod = prod *last;
            num=num/10;
        }
        if(sum==prod){
            System.out.println("Spy number:" + prod);
        }
        else{
            System.out.println("Not a Spy number:" + prod);
        }
    }
}
