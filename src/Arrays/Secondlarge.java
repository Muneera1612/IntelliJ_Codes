package Arrays;

import java.util.Scanner;

public class Secondlarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[]=new int[size];
        //int SecMax=Integer.MIN_VALUE;
    for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secmax=0;
        int triedmax=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]> max) {
                triedmax = secmax;
                secmax = max;
                max = arr[i];
            }
            else if(secmax>arr[i] && arr[i]!=max){
                triedmax=secmax;
                secmax=arr[i];
            }
            else if(triedmax<arr[i] && arr[i]!=secmax){
                triedmax=arr[i];
            }
        }
        System.out.println(" third Largest"+ triedmax);

    }
}