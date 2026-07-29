package Arrays;

import java.util.Scanner;

public class    averagesum {
    public static void main(String[]args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        System.out.println("Enter the numbers");
        int[] arr = new int[size];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {  //i=0;i<6;
            arr[i] = sc.nextInt();  //1 2 3 4 5 6
        }
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i]; //0+1=1
            //1+2=3
            //3+3=6
            //6+4=10
            //10+5=15
            //15+6=21
        }
        int average = sum / size;  //21/6 = 3
        for(int i=0;i<size;i++){
            if (arr[i] > average) {  //1>3 2>3
                count += 1;  //0+1=1
                //1+1=2
            }
        }
        System.out.println( "Enter the No.of count:"+count);
    }
}
