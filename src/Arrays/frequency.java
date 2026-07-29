package Arrays;
import java.util.Scanner;
public class frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            int count=0;
            boolean counted=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j] ){
                    counted=true;
                    break;
                }
            }
            if(counted){
                continue;
            }
            //count frequency
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            System.out.println(arr[i] + "= "+ count);
        }
    }
}
