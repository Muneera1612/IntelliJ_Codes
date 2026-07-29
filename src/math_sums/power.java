package math_sums;
import java.util.Scanner;
public class power {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();//3
        int result=1;
        for(int i=1;i<=x;i++){  //1<=3
            result=result*x;  //1*3=3
            //3*3=9
            //9*3=27
            System.out.println(result);//3  9  27
        }

    }
}
