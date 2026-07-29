package String;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[]args){
        String str=new String ("madam");
        //vowels and consonant
        int Vowels=0;
        int Conso=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                Vowels+=1;
            }
            else{
                Conso+=1;
            }
        }
        System.out.println("Count the number of Vowels "+Vowels);
        System.out.println("Count the number of Consonants "+Conso);

        //pallindrome
        /*String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
        if(str.equals(reverse)){
            System.out.println("It is Pallindrome ");
        }
        else{
            System.out.println("It is not a Pallindrome");

        }*/
        }
    }

