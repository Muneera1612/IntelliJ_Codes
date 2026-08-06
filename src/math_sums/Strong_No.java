package math_sums;

import java.util.Scanner;
public class Strong_No {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        int temp=num;
        int original=num;
        int sum=0;
        while(temp>0){
            int last=temp%10;
            int fact=1;
            for(int i=1;i<=last;i++){
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        if(original==sum){
            System.out.println("The strong numbere is :"+ original);
        }
        else{
            System.out.println("Not strong number");
        }
    }
}
