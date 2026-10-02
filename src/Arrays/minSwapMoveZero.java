package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class minSwapMoveZero {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter the array: ");
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[]result=new int[size];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                result[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
