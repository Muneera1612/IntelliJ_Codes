package String;
import java.util.Scanner;
public class Last_digitString {
    //finds the last digit of a>b(a raised to the power of b).
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int result=1;
        int n=Integer.parseInt(a);
        int num = Integer.parseInt(b);
        for (int i = 1; i <= num; i++) {
            result=result*n;
        }
        System.out.println(result);
        int last=result%10;
        System.out.println(last);
    }
}
