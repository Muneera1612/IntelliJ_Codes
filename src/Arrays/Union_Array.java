package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Union_Array {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size=sc.nextInt();
        int size1=sc.nextInt();
        System.out.println("Enter the First Array: ");
        int [] arr1=new int [size];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the Second Array:");
        int [] arr2=new int[size1];
        int [] union=new int [size+size1];
        int j=0;
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++) {
            union[j]=arr1[i];
            j++;
        }
        boolean found =false;
        for(int k=0;k<size;k++){
            if(arr2[k] == arr1[k]){
                found = true;
                break;
            }
        }

        if(!found){
            union[j] = arr2[j];
            j++;
        }
        System.out.println(Arrays.toString(union));
    }

}
