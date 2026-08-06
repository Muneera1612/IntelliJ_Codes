package Arrays;

import java.util.Scanner;
public class Majority_Element {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the size:");
        //int size = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] arr = {1,2,3,2,4,2};
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }*/
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                System.out.println("Majority elemnt: "+arr[i]);
                return;
            }
        }
        System.out.println("No majority elemnt");
    }
}


/*int count=0;
        int candiate=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(count==0){//2 3 3 4 3
                candiate=num;  //3
            }
            if(num==candiate){
                count++;
            }
            else{
                count--;
            }
        }*/
