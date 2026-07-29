package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean is_agrm = true;
        //length check
        if(str1.length()!=str2.length()){
            is_agrm=false;
        }
        else { //convert to character
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            //sorted the char
            Arrays.sort(a1);
            Arrays.sort(a2);
            //compare character
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    is_agrm = false;
                    break;
                }
            }
        }
        //print result
        if(is_agrm){
            System.out.println("Anagram ");
        }
        else{
            System.out.println("Not a Anagram ");
        }

    }
}