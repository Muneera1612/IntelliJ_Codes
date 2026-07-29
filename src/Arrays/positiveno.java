package Arrays;

import java.util.Scanner;

public class positiveno {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int []arr=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean is_positive=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                is_positive=false;
            }

        }
        if(is_positive==true){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

