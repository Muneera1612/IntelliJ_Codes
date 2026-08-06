package Arrays;

import java.util.Scanner;
import java.util.Arrays;
class Right_rotate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size: ");
            int size = sc.nextInt();
            System.out.println("Enter the Array: ");
            int[] arr = new int[size];

            int k = 2; // number of right rotations

            // Input array
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            // Right rotate k times
            for (int i = 0; i < k; i++) {

                int last = arr[arr.length - 1]; // store last element

                // Shift elements to right
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }

                arr[0] = last; // put last element at first
            }
            System.out.println(Arrays.toString(arr));
        }
    }
