package EliteClass;

import java.util.Scanner;
public class MinandMax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        int max=0;
        int min=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
