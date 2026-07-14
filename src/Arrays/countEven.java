package Arrays;

import java.util.Scanner;

public class countEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] arr = new int[size];
        int count=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count= count+1;
            }
        }
        System.out.println("Enter the even number count:"+count);
    }
}

