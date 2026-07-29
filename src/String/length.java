package String;

public class length {
    public static void main(String[]args){
        String str="Muneera Parveen";
        String str1="Muneera ";
        String s="";
        /*String str="Java";
        for(int i=0;i<str.length();i++){
            System.out.println(str.length());
            break;
        }*/
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("n"));
        System.out.println(str.concat(str1));
        System.out.println(s.isEmpty());
        System.out.println(str.replace('a','o'));
    }

}
