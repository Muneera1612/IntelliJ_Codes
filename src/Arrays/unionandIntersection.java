package Arrays;

import java.util.Scanner;
public class unionandIntersection {
    static void main() {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int []a={1,2,3};
        int []b={3,2,4};
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            } else if (a[i]>b[j]) {
                System.out.print(b[j]+" ");
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<b.length){
            System.out.print(b[j]+" ");
            j++;
        }
        /*i=0;
        j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            } else if (a[i]>b[j]) {
                j++;
            }
            else{
                System.out.println(a[i]+" ");
                i++;
                j++;
            }*/
    }
}
