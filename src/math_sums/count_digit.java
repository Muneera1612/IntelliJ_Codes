package math_sums;

import java.util.Scanner;

public class count_digit {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int count=0;
        while(num>0){
            int last=num%10;
            if(last<=0){
                System.out.println("-1");
            }
            count+=1;
            num/=10;
        }
        System.out.println(count);

    }
}
