package String;

import java.util.Scanner;
public class nonreptd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int pointer = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    pointer++;
                }
            }
            if (pointer == 1) {
                System.out.println(str.charAt(i) + " ");
            }
        }
    }
}