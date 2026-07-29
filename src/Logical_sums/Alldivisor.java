package Logical_sums;

import java.util.Scanner;

public class Alldivisor {{}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("All Divisor of"+num);
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }

    }

}
