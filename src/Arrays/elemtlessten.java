package Arrays;
import java .util.Scanner;
public class elemtlessten {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int [5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<10){
                System.out.println(arr[i]);
            }
        }
    }

}
