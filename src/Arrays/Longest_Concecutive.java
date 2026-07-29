package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Longest_Concecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the Array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);//[0,3,7,2,5,8,4,6,0,1]
        int count = 1;
        int longcount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                count = 1;
            }
            if (count > longcount) {
                longcount = count;
            }
        }
        System.out.println(longcount);
    }
}

