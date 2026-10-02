package String;

import java.util.Scanner;

public class Lengthoflastword {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str="muneera parv 5een";
        int i=str.length()-1;
        int count=0;
        while(i>=0 && str.charAt(i)==' '){
            i--;
        }
        while(i>=0 && str.charAt(i)!=' '){
            count++;
            i--;
        }
        System.out.println(count);
    }
}