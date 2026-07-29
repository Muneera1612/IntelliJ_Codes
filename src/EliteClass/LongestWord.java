package EliteClass;

import java.util.Scanner;
import static java.lang.System.*;
public class LongestWord {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]words=str.split(" ");
        int count=0;
        String LongestWord="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int count1= word.length();
            if(count1>count){
                count=count1;
                LongestWord=word;
            }
        }
        out.println("The Longest word is "+LongestWord);
    }
}
