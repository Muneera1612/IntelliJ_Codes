package Arrays;

import java.util.*;
public class kthMinANdMax {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Kth minimum = " + arr[k-1] );
        System.out.println("KTh Maximum = "+ arr[arr.length-k]);
    }
}
