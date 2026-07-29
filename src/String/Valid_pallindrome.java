package String;
import java.util.Scanner;
public class Valid_pallindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                result=result+str.charAt(i);
            }
        }
        System.out.println(result);
        result=result.toLowerCase();
        System.out.println(result);

        String temp="";
        for(int i=result.length()-1;i>=0;i--){
            temp+=result.charAt(i);
        }
        if(result.equals(temp)){
            System.out.println("VAlid Pallindrome");
            System.out.println("True");
        }
        else{
            System.out.println("False ");
        }
    }
}
