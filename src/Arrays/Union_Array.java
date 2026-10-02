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
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int [] union=new int [size+size1];
        int u=0;
        for(int i=0;i<arr1.length;i++) {
            union[u]=arr1[i];
            u++;
        }
        for(int i=0;i<arr2.length;i++){
            boolean found=false;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                        found=true;
                        break;
                }
            }
            if(!found){
                union[u]=arr2[i];
                u++;
            }
        }
        int []intersection=new int[Math.min(size,size1)];
        int k=0;
        for(int i=0;i<size1;i++){
            for(int j=0;j<size;j++){
                if(arr2[i]==arr1[j]){
                    intersection[k]=arr2[i];
                    k++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(union));
        System.out.println(Arrays.toString(intersection));
    }

}
