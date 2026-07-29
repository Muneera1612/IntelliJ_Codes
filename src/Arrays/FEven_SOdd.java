package Arrays;

import java.util.Scanner;

public class FEven_SOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int[] arr = new int[6];
        int mid = arr.length / 2;
        boolean is_valid = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < mid; i++) {
            if (arr[i] % 2 != 0) {
                is_valid = false;
                break;
            }
        }
        for (int i = mid; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                is_valid = false;
                break;
            }
        }
        if (is_valid == true) {
            System.out.println("Valid array");
        } else {
            System.out.println("Invalid array");
        }
    }
}


        /*int sum1=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i< mid;i++){
            sum1+=arr[i] ;
        }
        int sum2 = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum2+=arr[i];
        }
        System.out.println("Enter the first half:"+ sum1);
        System.out.println("Enter the Second half:"+sum2);

    }
}

*/