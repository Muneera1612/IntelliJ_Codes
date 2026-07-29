
package EliteClass;

import java.util.Arrays;
import java.util.Scanner;

    public class StringNumArraySort {
        public static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter numeric array size : ");
            int size = sc.nextInt();
            System.out.print("enter Numeric array elements : ");
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("before sorting : ");
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
            System.out.print("after sorting : ");
            System.out.println(Arrays.toString(arr));
            //--------------------------------------------------
            Scanner s = new Scanner(System.in);
            System.out.print("enter string array size : ");
            int size1 = s.nextInt();
            System.out.println("enter String array elements : ");
            String[] arr1 = new String[size1];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.next();
            }
            System.out.print("before sorting : ");
            System.out.println(Arrays.toString(arr1));
            for (int i = 0; i < arr1.length; i++) {
                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[i].compareToIgnoreCase(arr1[j]) > 0) {
                        String temp = arr1[j];
                        arr1[j] = arr1[i];
                        arr1[i] = temp;
                    }
                }
            }
            System.out.print("after sorting : ");
            System.out.println(Arrays.toString(arr1));
        }
    }