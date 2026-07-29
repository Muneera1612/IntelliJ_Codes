package EliteClass;

import java.util.Scanner;

public class Averge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the Array:");
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Total sum of Array "+sum);
        int average = sum / arr.length;
        System.out.println("Average of Array "+average);
    }
}