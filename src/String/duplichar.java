package String;

import java.util.Scanner;

public class duplichar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println(sb);
       /* String str=sc.nextLine();
        String res=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=i+1;j<str.length();j++){
                if(ch==str.charAt(j)){
                    res=res+ch;
                }
            }
        }
        System.out.println(res);*/

    }
}
