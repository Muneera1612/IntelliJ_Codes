package Arrays;

import java.util.Scanner;
public class LongestPallindrome {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=-1;
        for(int i=0;i<n;i++) {
            int num = arr[i];
            int temp = num;
            int rev = 0;
            while (temp > 0) {
                int last = temp % 10;
                rev = (rev * 10) + last;
                temp = temp / 10;
            }
            if (num == rev && num > largest) {
                largest = num;
            }
        }
            if(largest ==-1){
                System.out.println("NO pallindrome");
            }
            else {
                System.out.println("Pallindrome = " + largest);
            }
    }
}
