package String;

public class MathematicalExp {
    public static void main(String[] args){
        String str="(a+b)(a*b)";
        int balance=0;
        boolean valid =true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                balance++;
            }
            else if(ch==')'){
                balance--;
                if(ch<0){
                    valid=false;
                    break;
                }
            }
            if(balance!=0){
                valid =false;
            }
            if(valid){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}
