package math_sums;
import java.util.Scanner;
public class maxinteger {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int max=0;
        int num=sc.nextInt();//23867
        while(num>0) {
            //23867>0
            int reminder=num%10;
            //23867%10=7
            //2386%10=6
            //238%10=8
            //23%10=3
            //2%10=0
            if(reminder>max){
                //7>0
                //8>7
                max=reminder;//0=7

            }
            num=num/10; //23867/10=2386
        }
        System.out.println(max);  //8
    }
}
