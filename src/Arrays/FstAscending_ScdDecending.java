package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class FstAscending_ScdDecending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        System.out.println("Enter the array: ");
        int [] arr=new int[size];
        int n=arr.length;
        int mid=(n+1)/2;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,0,mid);
        Arrays.sort(arr,mid,n);
        int left=mid;
        int right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
        /*for(int i=0;i<mid-1;i++){
            for(int j=i+1;j<mid;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }*/
        /*for(int i=mid;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }*/
        System.out.println(Arrays.toString(arr));
    }
}
