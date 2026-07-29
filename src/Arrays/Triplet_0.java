package Arrays;

import java.util.Scanner;
public class Triplet_0 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=sc.nextInt();
        System.out.println("enter the Array: ");
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("false");
                    }
                }
            }
        }
    }
}
