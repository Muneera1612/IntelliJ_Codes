package Arrays;
import java.util.Scanner;
public class Perfect_no {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
            if(temp==sum){
                System.out.println("True");
            }
            else{
                System.out.println("false");
            }
        }
    }