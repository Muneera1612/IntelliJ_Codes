package EliteClass;

import java.util.Scanner;
public class CheckSorted {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean found=true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    found=false;
                }
            }
        }
        if(found ==false){
            System.out.println("Array is not sorted");
        }
        else{
            System.out.println("Array is sorted ");
        }
    }
}