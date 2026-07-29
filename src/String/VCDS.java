package String;

import java.util.Scanner;

public class VCDS {
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the String");
        String name="JAVA 123 PROGRAMMING";
        //String name=new String();
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'||ch=='O'||ch=='U'){
                count+=1;
            }
            else if(ch==' '|| ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='*'){
                count1+=1;
            }
            else if(Character.isDigit(name.charAt(i))){
                count2+=1;
            }
            else {
                count3+=1;
            }
        }
        System.out.println("Count of Vowels:"+count);
        System.out.println("Count of character:"+count1);
        System.out.println("Count of Digit:"+count2);
        System.out.println(" count of Consonent:"+count3);
    }
}
