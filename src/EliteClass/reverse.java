package EliteClass;
import java.util.Arrays;
import java.util.Scanner;
    public class reverse {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size:");
            int size=sc.nextInt();
            System.out.println("Enter the array:");
            int []arr= new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length/2;i++){
                int temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
            System.out.println(Arrays.toString(arr));

            //missing value
                    int sum=0;
                    for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                    }
                    for(int i=0;i<size;i++){
                        sum=sum+arr[i];
                    }
                    System.out.println(sum);
                    int formula=(size*(size+1))/2;
                    int missingvalue=formula-sum;
                    System.out.println("Enter the missing value:"+ missingvalue);
                }

            }


