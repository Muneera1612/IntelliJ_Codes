package Arrays;
import java.util.*;
public class mergesortwithoutspace {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int size1= sc.nextInt();
        System.out.println("Enter the Array1: ");
        int []a=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Sec Array: ");
        int[]b=new int[size1];
        for(int j=0;j<b.length;j++){
            b[j]= sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i-- ){
            if(a[i]>b[0]){
                //swap
                int temp=a[i];
                a[i]=b[0];
                b[0]=temp;
                //place b[0] at its correct position
                int first=b[0];
                int k;
                for(k=1;k<b.length;k++){
                    b[k-1]=b[k];
                }
                b[k-1]=first;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
