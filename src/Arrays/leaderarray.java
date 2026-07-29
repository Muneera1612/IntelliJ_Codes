package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class leaderarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[size-1];
        System.out.println(max);

        for(int i = size-2; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}

        /*for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[i];
                }else if(arr[i]<arr[j]){
                    arr[i]=0;
                }
            }
            if(arr[i]!=0) {
                list.add(arr[i]);
            }
        }*/
        //System.out.println(list);