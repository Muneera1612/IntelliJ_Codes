package pattern;

public class coderpattern {
    public static void main(String[]args) {
        String str = "swiss";

        for (int i = 0; i < str.length(); i++) {

            int pointer = 0;
            for (int j = i + 1; j <str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    pointer += 1;
                }
            }
            if (pointer == 0) {
                System.out.println(str.charAt(i) +"");
                break;
            }
        }
    }
}

        /*String str="coder";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }*/

