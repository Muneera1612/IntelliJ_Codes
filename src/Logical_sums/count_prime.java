package Logical_sums;

import java.util.Scanner;

public class count_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int prime_count = 0;
        for (int i = 2; i < n; i++) {
            int last=n%10;
            int count=0;

            if (last==1 || last==2|| last == 3 || last == 5 || last == 7) {
                count+=1;
            }
            n/=10;
        }
        if(prime_count==0){
            prime_count+=1;
        }

    }
}
