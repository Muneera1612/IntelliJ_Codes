package math_sums;

import java.util.Scanner;

public class FriendlyPair {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1=sc.nextInt();
        System.out.println("Enter the number2: ");
        int num2=sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<num1;i++){
            if(num1%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<num2;i++){
            if(num2%i==0){
                sum2+=i;
            }
        }
        if(sum1==num2 && sum2==num1){
            System.out.println(num1 +" and "+ num2 +" are"+ " Friendly pair");
        }
        else{
            System.out.println("Not a friendly pair");
        }
    }
}
