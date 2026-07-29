package Data_Structure;

public class BinarySearch {
    public static void main(String[]args){
        int [] arr={2,5,8,12,16,23,38,45,56,72};
        int target=23;
        int mid;
        int right=0;
        int left=arr.length-1;
        boolean found=false;
        while(left>=right){
            mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.println("Element is found "+mid);
                found=true;
                break;
            }
            else if(arr[mid]<target){
                right=mid+1;
            }
            else{
                left=mid-1;
            }
        }
        if(!found){
            System.out.println("Element is not found ");
        }
    }
}

