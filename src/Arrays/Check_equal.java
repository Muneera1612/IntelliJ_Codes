package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Check_equal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=sc.nextInt();
        System.out.println("Enter the Array: ");
        int []arr= new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=sc.nextInt();
        }
        boolean found= false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    found=true;
                }
            }
        }
        if(found){
            for(int i=0;i<arr.length;i++) {
                System.out.println(arr[i]+" ");
            }
            System.out.println("Equal array ");
        }
    }
}
