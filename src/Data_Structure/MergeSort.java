/*
package Data_Structure;

public class MergeSort {
    private static void mergeSort(int[] arr, int left, int right) {
        if(l<r){
            int mid=(left +right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr, mid+1,right);

            merge(arr,left,mid,right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1=mid-left+1;
        int n2=right-mid;
        int []leftArr=new int[n1];
        int []rightArr=new int[n2];
        //copy values using for loop
        for(int x=0;x<n1;x++){
            leftArr[x] = arr[left + x];
        }
        for(int x=0;x<n2;x++){
            rightArr[x]=arr[mid+1+x];
        }
        //merging using 2variable i and j then store arr is k
        int i =0;
        int j=0;
        int k=left;
        // merging them
        while(i<n1 && j<n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[]args){
        int []arr={3,5,1,4,6,2};
        for(int n:arr){
                  System.out.println(n+" ");
        }
        System.out.println();
        mergeSort(arr, 0,arr.length-1);
        System.out.println("After sorting ");
        for(int n:arr){
            System.out.println(n+" ");
        }
    }
}
*/
