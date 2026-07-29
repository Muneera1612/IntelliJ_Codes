package Arrays;
import java.util.Scanner;
public class countabvtwenty {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the key value:");
        int key=sc.nextInt();
        System.out.println("enter the values");
        int [] arr=new int [7];
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>key){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
