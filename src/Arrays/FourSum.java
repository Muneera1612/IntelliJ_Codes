package Arrays;

import java.util.Scanner;
public class FourSum {
        public static void main(String[]args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size:");
            int size=sc.nextInt();
            System.out.println("enter the target value :");
            int target=sc.nextInt();
            System.out.println("Enter the Array :");
            int []arr=new int [size];

            boolean found=true;
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(int a=0;a<arr.length-3;a++){
                for(int b=a+1;b<arr.length-2;b++){
                    for(int c=b+1;c<arr.length-1;c++){
                        for(int d=c+1;d<arr.length;d++){
                            if(target == arr[a] + arr[b] + arr[c] + arr[d]) {
                                System.out.println(arr[a] + " " + arr[b] + " " + arr[c] + " " + arr[d]);
                                found = false;
                            }
                        }
                    }
                }
            }
            if(!found){
                System.out.println("-1");
            }
    }
}
 //[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]