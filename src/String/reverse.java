package String;

public class reverse {
    public static void main(String[] args){
        String sc="Java Programming Language";
        String reverse=" ";
        for(int i=sc.length()-1;i>=0;i--){
            reverse+=sc.charAt(i);
        }
        System.out.println(reverse);
    }

}
