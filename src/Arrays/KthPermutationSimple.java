package Arrays;
import java.util.Scanner;
public class KthPermutationSimple {
    static int count = 0;  // To count permutations
    static String result = "";

        // Function to generate permutations
        static void permute(int [] arr, int start, int end, int k) {

            // Base case
            if (start == end) {
                count++;

                // When kth permutation reached
                if (count == k) {
                    result = "";
                    for (int num : arr) {
                        result += num;
                    }
                }
            }
            else {
                for (int i = start; i <= end; i++) {

                    swap(arr, start, i);

                    permute(arr, start + 1, end, k);

                    swap(arr, start, i); // Backtrack
                }
            }
        }

        // Swap function
        static void swap(int [] arr, int i, int j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Create array [1,2,3,...,n]
            int []arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }

            permute(arr, 0, n - 1, k);

            System.out.println("Kth Permutation: " + result);
        }
    }
