package EliteClass;

import java.util.Scanner;

public class RemoveDuplcate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int size = sc.nextInt();
        System.out.println("Enter the Array: ");
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //remove duplicate
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                }
            }
            if (isDuplicate==false) {
                System.out.println("Without Duplicate element "+arr[i]);
            }
        }

        //find duplicate
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element "+arr[i]);
                    break;
                }
            }
        }
    }
}
