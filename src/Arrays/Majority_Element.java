package Arrays;

import java.util.Scanner;
public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
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
        }
        count = 0;
        /*for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1;*/
        System.out.println(candiate);
    }
}
