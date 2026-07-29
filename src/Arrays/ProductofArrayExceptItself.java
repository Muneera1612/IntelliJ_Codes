package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ProductofArrayExceptItself {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the Arrays: ");
        int [] arr=new int[size];
        //int[] result = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++) {
            int prod=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j) {
                    prod = prod * arr[j];
                }
            }
            System.out.println(prod);
        }
    }
}