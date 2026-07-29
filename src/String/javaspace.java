package String;

import java.util.Scanner;

public class javaspace {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i)).append(" ");
            //sb.append(str.charAt(i)).append( str.charAt(i));
        }
        System.out.println(sb);
    }
}
