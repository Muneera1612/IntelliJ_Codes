package Arrays;

import java.util.Scanner;

public class replaceEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        System.out.println("Enter the numbers");
        int[] arr = new int[6];
        for (int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                arr[i]=0;
                System.out.println(arr[i]);
            }
        }
    }
}
