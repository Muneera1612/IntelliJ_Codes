package Arrays;

import java.util.Scanner;

public class threemultiply {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the size:");
        int size=sc.nextInt();
        System.out.println("Enter the numbers");
        int []arr=new int[6];
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 3 == 0) {
                count+=1;
                System.out.println(arr[i]);
            }
        }
        System.out.println(count);
    }
}
