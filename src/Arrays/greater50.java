package Arrays;

import java.util.Scanner;

public class greater50 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 50) {
                System.out.println(arr[i]);
            }
        }
    }
}
