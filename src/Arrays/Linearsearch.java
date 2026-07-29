package Arrays;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the numbers :");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Linear Search "+arr[i]);
            } else {
                System.out.println("Not a Linear Search "+arr[i]);
            }
        }
    }
}
