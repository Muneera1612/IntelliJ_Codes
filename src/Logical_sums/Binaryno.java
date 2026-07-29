package Logical_sums;

import java.util.Scanner;
public class Binaryno {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        boolean is_bl=false;

        int count = 0;
        while (num > 0) {
            int last = num % 10;
            if(last>=1 && last<=0){
                is_bl=true;
            }
        }
        if (is_bl == true) {
            System.out.println( "is a binary number");
        }
        else {
            System.out.println("is not a binary number");
        }
    }
}
