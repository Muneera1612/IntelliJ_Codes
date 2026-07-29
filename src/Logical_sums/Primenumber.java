package Logical_sums;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int count=0;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
                System.out.println("Prime"+num);
                break;
            }
            else{
                System.out.println("Not Prime"+num);
                break;
            }
        }

}

}
