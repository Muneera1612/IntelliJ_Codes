package math_sums;

import java.util.Scanner;

public class EOPNZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be enter:");
        int range = sc.nextInt();
        int even_number = 0;
        int odd_number = 0;
        int pos_number = 0;
        int neg_number = 0;
        int no_zero = 0;
        for (int i = 0; i <= range; i++) {
            System.out.println("Enter inputs:");
            int num =sc.nextInt();
            if (num > 0) {
                pos_number += 1;
                if (num % 2 == 0) {
                    even_number += 1;
                }
                else {
                    odd_number += 1;
                }
            }
            else if (num < 0) {
                neg_number += 1;
                if (num % 2 == 0) {
                    even_number += 1;
                } else {
                    odd_number += 1;
                }
            }
            else{
                no_zero += 1;
            }
        }
        System.out.println("Number of positive number:" + pos_number);
        System.out.println("Number of negative number:" + neg_number);
        System.out.println("Number of even number:" + even_number);
        System.out.println("Number of odd number:" + odd_number);
        System.out.println("Number of zeros :" + no_zero);
    }
}
