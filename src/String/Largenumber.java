//package String;
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class Largenumber {
//        public static void main(String[]args){
//            Scanner sc=new Scanner(System.in);
//            int n=sc.nextInt();
//            System.out.println("Enter the number: ");
//            int []arr=new int[n];
//            String[] arr1 = new String[arr.length];
//            //convert integer to  string
//            for(int i=0;i<n;i++){
//                arr1[i]=String.valueOf(arr[i]);
//            }
//            // Custom sorting
//            Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
//
//            // If the largest element is "0"
//            if (arr[0].equals("0")) {
//                System.out.println("0");
//            }
//
//            // Build answer
//            StringBuilder sb = new StringBuilder();
//
//            for (String s : arr) {
//                sb.append(s);
//            }
//
//            System.out.println(Arrays.toString(sb));;
//        }
//    }
