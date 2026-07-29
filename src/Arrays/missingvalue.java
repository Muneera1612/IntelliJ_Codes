package Arrays;
import java.util.Scanner;

public class missingvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the Array:");
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size-1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                System.out.println(arr[i] + 1);
            }
        }
    }
}
        /*for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        int formula=(size*(size+1))/2;
        int missingvalue=formula-sum;
        System.out.println("Enter the missing value:"+ missingvalue);
    }
}*/
