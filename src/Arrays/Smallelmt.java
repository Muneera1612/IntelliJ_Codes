package Arrays;

import java.util.Scanner;

public class Smallelmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the numbers");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int secmin=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                secmin=min;
                min=arr[i];
            }
            else if(arr[i]<secmin && arr[i]!=min){
                secmin=arr[i];
            }
        }
        System.out.println("Second smallest "+secmin);
        System.out.println("Smallest "+ min);
    }
}
