package EliteClass;

import java.util.Arrays;
import java.util.Scanner;
public class SmallestElmt {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //smallest and second smallest Elmt
        int min=arr[0];
        int secmin=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                secmin=min;
                min=arr[i];
            }
            else if(arr[i]<secmin && arr[i]!=min){

                secmin=arr[i];
            }
        }
        System.out.println("First smallest element "+min);
        System.out.println("Second smallest element "+secmin);

        //sort array
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
