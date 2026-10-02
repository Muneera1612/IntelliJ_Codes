package Arrays;
import java.util.*;
public class minimizeHeightDifference {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter heights:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter K: ");
            int k = sc.nextInt();
            Arrays.sort(arr);
            int ans = arr[n - 1] - arr[0];
            int small = arr[0] + k;
            int large = arr[n - 1] - k;
//sometime min value greater then max so loop
            if (small > large) {
                int temp = small;
                small = large;
                large = temp;
            }

            for (int i = 1; i < n - 1; i++) {
                int subtract = arr[i] - k;
                int add = arr[i] + k;
                if (subtract >= small || add <= large){
                    continue;
                }
                if (large - subtract <= add - small){
                    small = subtract;
                }
                else{
                    large = add;
                    }
            }
            ans = Math.min(ans, large - small);
            System.out.println("Minimum Difference = " + ans);
        }
    }