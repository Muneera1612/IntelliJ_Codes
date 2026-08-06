package math_sums;
import java.util.Scanner;
public class ValidDigit {
    //a digit occurs in a number, but the number should NOT start with that digit.
    static void main() {
        //atleast one occurence in the same digit &&
        // the no cnt start with the digit
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number: "+n);
        int x=sc.nextInt();
        System.out.println("Enter the digit: "+x);
        int temp=n;
        int first=n;
        //check the first number
        while(first>=10){
            first/=10;
        }
        //check start with
        if(first==x){
            System.out.println(false);;
        }
        //apperence if the number
        while(temp>0){
            if(temp%10 == x){
                System.out.println(true);            }
            temp/=10;
        }
    }
}
