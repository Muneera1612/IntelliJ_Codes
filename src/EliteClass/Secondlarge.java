package EliteClass;

import java.util.Scanner;

public class Secondlarge {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size:");
            int size = sc.nextInt();
            int []arr=new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int max = 0;
            int secmax=0;
            for (int i = 0; i < arr.length; i++) {

                if (arr[i]> max) {
                    secmax = max;
                    max = arr[i];
                }
                else if(arr[i]>secmax && arr[i]!=max){

                    secmax=arr[i];
                }
            }
            System.out.println("Second Largest element "+secmax);

        }
    }
