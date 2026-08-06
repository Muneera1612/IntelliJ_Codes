package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Max_Subarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int size=sc.nextInt();
        System.out.println("Enter the Array; ");
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int currentSum=0;
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        System.out.println("The maximum subarray is :"+maxSum);
    }
}

        /*int cs=arr[0];
        int ms=arr[0];
        for(int i=0;i<arr.length;i++){
            cs=Math.max(arr[i],arr[i]+cs);
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);*/
