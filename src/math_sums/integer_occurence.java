package math_sums;

import java.util.Scanner;

public class integer_occurence {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            int last=num%10;
            if(last==5){
                count+=1;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
