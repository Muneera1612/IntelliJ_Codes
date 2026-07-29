package Logical_sums;

import java.util.Scanner;

public class Bus_no {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int  num=sc.nextInt();
        while(num>0){
            int last=num%10;
            if(num%7==0 || last==7){
                System.out.println("Bus number:" + num);
                break;
            }
            else {
                System.out.println("Not a Bus number:" + num);
                break;
            }
        }

    }
}
