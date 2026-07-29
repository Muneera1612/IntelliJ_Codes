package EliteClass;

import java.util.Scanner;

public class SumArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        System.out.println("Enter the Array:");
        int []arr=new  int[size];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
