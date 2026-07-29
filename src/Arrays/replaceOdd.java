package Arrays;

import java.util.Scanner;

public class replaceOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int []arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr[i]=-1;
            }
            System.out.println(arr[i]);
        }
    }
}
