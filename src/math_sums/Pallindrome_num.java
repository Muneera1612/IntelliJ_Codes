package math_sums;
import java.util.Scanner;
public class Pallindrome_num {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            int last=num%10;
            rev=(rev*10)+last;
            num/=10;
        }
        System.out.println(rev);
        if(rev==temp){
            System.out.println("It is Pallindrome");
        }
        else{
            System.out.println("It is not a Pallindrome");
        }
    }
}
