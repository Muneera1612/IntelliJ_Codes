package TwoDimArray;

import java.util.Scanner;
public class PrimeinDiagonal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //int result = 0;
        int size=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j || i + j == size - 1){
                    //result=arr[i][j];
                    System.out.print(arr[i][j]+" ");
                }

            }
            System.out.println();
        }
    }
}
