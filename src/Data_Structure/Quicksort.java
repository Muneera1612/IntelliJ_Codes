package Data_Structure;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[]args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        int low = 0;
        int high = arr.length - 1;
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            System.out.println(Arrays.toString(arr));
        }

    }
}
