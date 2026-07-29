package Arrays;
import java.util.Scanner;
public class ValidParentheses {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack[++top] = ch;
            } else {
                if (top == -1) {
                    System.out.println("false");
                }

                char open = stack[top--];

                if (ch == ')' && open != '(')
                    System.out.println("false");

                if (ch == ']' && open != '[')
                    System.out.println("false");

                if (ch == '}' && open != '{')
                    System.out.println("false");
            }
        }
        System.out.println(top==1);
        }
    }
