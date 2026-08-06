package Arrays;
import java.util.*;
public class MultiplySubstring {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the target: ");
        int n = sc.nextInt();
        System.out.println("Enter the Array: ");
        int[] arr = new int[size];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] * arr[j] == n) {
                    System.out.print("[ "+ arr[i]+" " +arr[j]+" ]");
                }
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]* arr[j]* arr[k]==n){
                        System.out.print("[ "+arr[i]+" "+arr[j]+" "+arr[k]+"]");
                    }
                }
            }
        }
    }
}
