package EliteClass;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        System.out.println("Enter the Array:");
        int [] arr=new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Specific value:");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
