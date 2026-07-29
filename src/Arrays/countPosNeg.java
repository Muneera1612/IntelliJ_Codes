package Arrays;

import java.util.Scanner;

public class countPosNeg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] arr = new int[size];
        int count = 0;
        int count1=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                count=count+1;
                System.out.println(arr[i]+"Positive");
            }
            else{
                count1=count1+1;
                System.out.println( arr[i]+"Negative");
            }
        }
        System.out.println("Enter the postive count"+ count);
        System.out.println("Enter the negative count"+ count1);
    }

}
