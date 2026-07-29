package problems;
import java.util.Scanner;
public class vowels {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        switch (ch){
            case 'a','e','i','o','u':
                System.out.println("Vowels");
                break;
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
                System.out.println("Consonent");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
