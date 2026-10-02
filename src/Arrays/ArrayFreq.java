package Arrays;

import java.util.*;

public class ArrayFreq {
    static void main() {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean []visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+"= "+ count);
        }
    }
}
/*
Scanner sc=new  Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
        System.out.println("Before swapping: "+ a +": "+b);
a=a+b;
b=a-b;
a=a-b;
        System.out.println("After swapping: "+ a +": "+b);*/
