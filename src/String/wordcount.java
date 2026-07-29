package String;

import java.util.Scanner;

public class wordcount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="JAVA 123 PROGRAMMING";
        //String str=new String();
        int word=1;
        int character=0;
        int space=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                space+=1;
                word+=1;
            }
            else{
                character+=1;
            }
        }
        System.out.println("Total count of word = "+word);
        System.out.println("Total count of spaces = "+space);
        System.out.println("Total count of character = "+character);
    }
}
