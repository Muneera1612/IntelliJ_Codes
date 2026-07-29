package EliteClass;

import java.util.Scanner;

public class CommonElmt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        System.out.println("Enter teh size1: ");
        int size1=sc.nextInt();
        System.out.println("Enter the  first Array: ");
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //second array
        System.out.println(("Enter the second Array: "));
        int []arr1=new int[size1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println("Common Element: "+arr[i]+" ");
                    break;
                }
            }
        }

    }
}
