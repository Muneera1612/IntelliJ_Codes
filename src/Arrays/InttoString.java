package Arrays;

import java.util.Scanner;
public class InttoString {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int str=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(str>0){
            str--;
            char ch=(char) ('A'+(str%26));
            sb.append(ch);
            str=str/26;
        }
        //return sb.reverse().toString();

    }
}
