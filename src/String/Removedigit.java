package String;

public class Removedigit {
    public static void main(String[] args) {
        String str = "JAVA123";
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            //if (Character.isDigit(str.charAt(i))) {  //with ! print the letters
                if (!(Character.isLetter(str.charAt(i)))) {
                    result = result + str.charAt(i);
                }
            //}
        }
        System.out.println(result);
    }
}

