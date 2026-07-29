package String;

import java.util.Scanner;

public class reverseword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]words=str.split(" ");
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String rev="";
            for(int j=word.length()-1;j>=0;j--){
                rev= rev+word.charAt(j);

            }
            System.out.print(rev +" ");
        }
    }
}
