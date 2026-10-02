package Arrays;

import java.util.Scanner;
public class ThirdMax {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);;
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        System.out.println("Enter the Arrays:");
        int []arr=new int[size];
        int max=0;
        int secmax=0;
        int thirdmax=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                thirdmax=secmax;
                secmax=max;
                max=arr[i];
            }
            else if(arr[i]>secmax && arr[i]!=max){
                thirdmax=secmax;
                secmax=arr[i];
            }
            else if(arr[i]>thirdmax && arr[i]!=secmax  && arr[i]!=max){
                thirdmax=arr[i];
            }
        }
        System.out.println("Enter the First maximum "+max);
        System.out.println("Enter the Second maximum "+secmax);
        System.out.println("Enter the Third maximum "+thirdmax);
    }
}
