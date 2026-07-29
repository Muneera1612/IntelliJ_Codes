package Arrays;

import java.util.Scanner;

public class countendZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 10 )== 0) {
                count =count+1;
            }
        }
        System.out.println("Enter the number of count:"+count);

    }
}