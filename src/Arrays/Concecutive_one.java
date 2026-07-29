package Arrays;

import java.util.Scanner;
public class Concecutive_one {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        int arr[]=new int [size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int longest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count>longest){
                    longest=count;
                }
                else{
                    count=0;
                }
            }
        }
        System.out.println(longest);
        }
    }
