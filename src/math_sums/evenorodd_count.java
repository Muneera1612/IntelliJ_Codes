package math_sums;
import java.util.Scanner;
public class evenorodd_count {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int even_count=0;
        int odd_count=0;
        while(num!=0){
            int last=num%10;
            if(last%2==0){
                even_count+=1;
            }
            else{
                odd_count+=1;
            }
            num=num/10;
        }
        System.out.println("Count of even number:" + even_count);
        System.out.println("Count of odd number:" + odd_count);
    }
}
