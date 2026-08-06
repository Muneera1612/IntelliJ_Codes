package math_sums;

import java.util.Scanner;
public class Happy_No {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        while (num != 1 && num != 4) {
            int sum = 0;
            while (num != 0) {
                int last = num % 10;
                sum += last * last;
                num = num / 10;
            }
            num = sum;
        }
        if(num==1){
            System.out.println("Happy number ");
        }
        else{
            System.out.println("Not a happy number: ");
        }
    }
}
