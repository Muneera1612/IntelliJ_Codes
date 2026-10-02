package String;

import java.util.Scanner;
public class PirntNextelmt {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.println((char) (ch+1));
        }
    }
}
