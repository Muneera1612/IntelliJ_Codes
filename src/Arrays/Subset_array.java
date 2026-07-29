package Arrays;

import java.util.Scanner;
public class Subset_array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int size1=sc.nextInt();
        System.out.println("Enter the array1: ");
        int []arr1=new int[size];
        for(int i=0;i< arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the Array2: ");
        int []arr2=new int [size1];
        for(int i=0;i< arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        boolean found =false;
        for(int i = 0; i<arr2.length; i++){
            found=false;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("false");
            }
        }
        System.out.println("True");
    }
}

/*
class Solution {
    public boolean isSubset(int a[], int b[]){
        boolean found =false;
        for(int i = 0; i<b.length; i++){
            found=false;
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
               return false;
            }
        }
        return true;
    }
}
*/