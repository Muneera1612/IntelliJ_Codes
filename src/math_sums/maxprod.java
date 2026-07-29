package math_sums;

import java.util.Scanner;

public class maxprod {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int num =sc.nextInt();
        int max=1;
        int prod=1;
        while(num>0){//567>0
            int last=num%10; //last=7
            if(last<max) {//7<1
                max=last*max;
                prod = prod * last;
            }
            num=num/10;
            max=last;
        }
        System.out.println(prod);
    }
}
