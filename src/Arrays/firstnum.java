package Arrays;

import java.util.Scanner;

public class firstnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] arr = new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            System.out.println("Enter the first element:"+arr[0]);
            System.out.println("Enter the last element:"+arr[arr.length-1]);
            System.out.println("Enter the mid element:"+arr[arr.length/2]);
            break;
        }
    }
}
