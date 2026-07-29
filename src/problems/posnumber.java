package problems;
import java.util.*;

public class posnumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
