package Logical_sums;

import java.util.Scanner;

public class Armstrongno {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int temp=num;
        int og=num;
        int count=0;
        int sum=0;
        while(num>0) {
            count += 1;
            num/=10;
        }
        while(temp>0) {
            int last = temp % 10;
            int prod=1;
            for (int i = 1; i <= count; i++) {
                prod *= last;
            }
            sum += prod;
            temp /= 10;
        }
        if(og==sum){
            System.out.println("Armstrong : "+og);
        }
        else {
            System.out.println("Not a Armstrong Number"+og);
        }
    }
}