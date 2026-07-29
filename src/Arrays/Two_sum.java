package Arrays;

import java.util.Scanner;
public class Two_sum {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size: ");
            int size=sc.nextInt();
            int target=-2;
            System.out.println("Enter the Array ");
            int[] arr = new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(int i = 0; i<arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
                }
            }
        }
    }
