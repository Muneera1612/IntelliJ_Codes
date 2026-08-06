package Arrays;

import java.util.Scanner;

public class MAxProd_Subarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the Array: ");
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int result=arr[0];
        for(int i=1;i<n;i++){
            //swap the negative no
            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            // Update max
            if (max * arr[i] > arr[i]) {
                max = max * arr[i];
            }
            else {
                max = arr[i];
            }
            // Update min
            if (min * arr[i] < arr[i]) {
                min = min * arr[i];
            }
            else {
                min = arr[i];
            }
            // Update answer
            if (max > result) {
                result = max;
            }
        }
        System.out.println(result);;

        }
    }
