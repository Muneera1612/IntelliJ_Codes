package math_sums;
import java.util.Scanner;
public class reverse_num {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt ();
        int rev=0;
        while(num!=0){
            //6543!=0
            int last= num %10; //6543%10=3
            //654%10=4
            //65%10=5
            //6%10=6
            rev=(rev * 10)+last;//(0*10)+3=3
            //4
            //5
            //6
            num=num/10; //6543/10=654
        }
        System.out.println(rev);  //3456
    }
}
