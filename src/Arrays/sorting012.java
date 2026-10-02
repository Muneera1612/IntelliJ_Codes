package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class sorting012 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        System.out.println("Enter the Array: ");
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                zero++;
            } else if (arr[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        int index=0;
        while(zero>0){
            arr[index]=0;
            index++;
            zero--;
        }
        while(one>0){
            arr[index]=1;
            index++;
            one--;
        }
        while(two>0){
            arr[index]=2;
            index++;
            two--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
