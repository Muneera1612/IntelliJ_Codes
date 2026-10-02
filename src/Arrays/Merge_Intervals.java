package Arrays;
import java.util.*;
public class Merge_Intervals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter the Array: ");
        int [][]arr=new int[size][2];
        for(int i=0;i<size;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        //sort by starting point
        Arrays.sort(arr,(a,b) ->Integer.compare(a[0],b[0]));
        int currentStart=arr[0][0];
        int currentEnd=arr[0][1];
        System.out.println("enter the intervals: ");
        for(int i=1;i<size;i++){
            int nextStart=arr[i][0];
            int nextEnd=arr[i][1];
            if(nextStart<=currentStart){
                currentEnd=Math.max(currentEnd,nextEnd);
            }
            else{
                System.out.println("[]"+ currentStart+ ","+currentEnd+ "]");
                currentStart=nextStart;
                currentEnd=nextEnd;
            }
        }
        System.out.printf("["+currentStart+","+currentEnd+"]");
    }
}
