package math_sums;
import java.util.Scanner;
public class consecutive {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int [size];
        for(int i=0;i<arr.length;i++){
            int count=0;
            int max=0;
            if(arr[i]==1){
                count+=1;
                if(count>max){
                    max+=1;
                }
            }else{
                count=0;
            }
        }
        }
    }
