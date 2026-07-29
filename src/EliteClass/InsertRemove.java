package EliteClass;

import java.util.Arrays;
//import java.util.Scanner;
public class InsertRemove {
    static void main(String[]args){
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array: ");
        int []arr=new int[8];
        arr[0] = 6;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 9;
        System.out.println(Arrays.toString(arr));
        //insert 10
        int size=4;
        for(int i=size;i>0;i--) {
            arr[i] = arr[i - 1];
        }
        arr[0]=10;
        size=size+1;
        System.out.println(Arrays.toString(arr));
        //insert 20
        for(int i=size;i>1;i--){
            arr[i]=arr[i-1];
        }
        arr[1]=20;
        size++;
        System.out.println(Arrays.toString(arr));
        //insert 30
        for(int i=0;i<arr.length;i++){
            arr[arr.length-1]=30;
        }
        System.out.println(Arrays.toString(arr));
        size++;

        //remove 10
        for(int i=0;i<size;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        size--;
        //remove 20
        for(int i=0;i<size;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        size--;
        //remove 30
        for(int i=0;i<size-1;i++){
            System.out.println(arr[i]);
        }


    }
}
