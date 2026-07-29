package EliteClass;

import java.util.Scanner;
public class Specificval {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        System.out.println("Enter the Array:");
        int []arr=new int[size];
        int key=6;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.out.println("Element is found at index "+arr[i]);
                found=true;
            }
        }
        if(!found){
            System.out.println("Element is not found ");
        }
    }
}
