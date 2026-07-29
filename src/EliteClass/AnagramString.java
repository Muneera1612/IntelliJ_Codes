package EliteClass;

import java.util.Scanner;

public class AnagramString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean is_agrm = true;
        if (str1.length() != str2.length()) {
            is_agrm = false;
        }
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(i)) {
                        is_agrm = true;
                    }
                }
            }
        }
        if (is_agrm == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}