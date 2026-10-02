package math_sums;

import java.util.Scanner;

public class DuckNo {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int last =num%10;
            if(last==0){
                System.out.println("Duck no:"+num);
            }
            else{
                System.out.println("Not a Duck no:"+num);
            }
        }
    }
}
