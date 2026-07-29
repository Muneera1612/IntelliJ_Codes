package pattern;
import java.util.Scanner;
public class pyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i+j>=size-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k=0;k<size;k++){
                if(i>=k+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=size-2;i>=0;i--){
            for(int j=0;j<size;j++){
                if(i+j>=size-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int k=0;k<size;k++){
                if(i>=k+1){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}