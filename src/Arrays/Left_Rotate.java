package Arrays;

import java.util.Arrays;
import java.util.Scanner;
class Left_Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array: ");

        // Input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 2; // number of left rotations

        // Left rotate k times
        for (int i = 0; i < k; i++) {

            int first = arr[0]; // store first element

            // Shift elements left
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = first; // place first at end
        }

        System.out.println(Arrays.toString(arr));
    }
}