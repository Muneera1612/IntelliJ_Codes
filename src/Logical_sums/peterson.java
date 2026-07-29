package Logical_sums;

import java.util.Scanner;

public class peterson {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0) {
            int last = num % 10;
            int fact = 1;
            for (int i =1; i <= last; i++) {
                fact *=i;
            }
            num = num / 10;
            sum += fact;
        }
        if(sum==temp){
            System.out.println("It is a Peterson Number:"+ sum);
        }
        else{
            System.out.println("It is not a Peterson number:"+ sum);
        }
    }
}
