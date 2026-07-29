package String;

import java.util.Scanner;

public class nonrepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //boolean is_repeat = true;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 's') {
                System.out.println(ch);
                break;
            }
        }
    }
}
        /*int []freq=new int [256];
        //count frequency
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch]++;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch]==1){
                System.out.println(ch);
                break;
            }
        }
    }

}*/
