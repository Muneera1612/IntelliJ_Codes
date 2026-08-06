package Data_Structure;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        int target=23;
        int mid;
        int left=0;
        int right=arr.length-1;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println("Element is found "+mid);
                found=true;
                break;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(!found){
            System.out.println("Element is not found ");
        }
    }
}

