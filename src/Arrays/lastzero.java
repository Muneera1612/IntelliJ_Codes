package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class lastzero {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int []result =new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                result[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                result[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
