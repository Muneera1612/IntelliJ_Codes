package math_sums;

import java.util.Scanner;
public class AddDigit {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>=10){
            int sum=0;
            while(num>0){
                int last=num%10;
                sum+=last;
                num/=10;
            }
            num=sum;
        }
        System.out.println(num);
    }
}
