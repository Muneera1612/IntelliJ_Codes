package String;

import java.util.Scanner;

public class reverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        //india country output country india
        for(int i=words.length-1;i>=0;i--){
            String word=words[i];
            String rev=" ";
            for(int j=0;j<word.length();j++){
                rev+=word.charAt(j);
            }
            System.out.print(rev+" ");
        }
        //india country output aidni yrtnuoc
        /*for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = " ";
            for (int j = word.length() - 1; j >= 0; j--) {
                rev += word.charAt(j);
            }
            System.out.print(rev + " ");
        }*/
    }
}