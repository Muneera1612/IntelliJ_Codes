package Arrays;
import java.util.*;
public class Allnegative {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the Array: ");
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //int []arr={1,2,-1,3,-2};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
