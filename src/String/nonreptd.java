package String;

import java.util.Scanner;
public class nonreptd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int poiter=0;
            for(int j=0;j<str.length();j++){
                char ch1=str.charAt(j);
                if(ch==ch1){
                    poiter+=1;
                }
            }
            if(poiter==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
