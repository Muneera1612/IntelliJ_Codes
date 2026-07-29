package Arrays;

import java.util.Scanner;
public class even_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the Array: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
            while (num > 0) {
                int last = num % 10;
                count++;
                num /= 10;
            }
            if (count % 2 == 0) {
                total++;

            }
        }
        System.out.println(total);
    }
}