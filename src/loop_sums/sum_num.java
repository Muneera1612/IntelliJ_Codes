package loop_sums;

public class sum_num {
    public static void main(String[]args) {
        int sum = 0;
        int num = 1745;
        while (num > 0) {
            int reminder = num % 10;
            num = num / 10;
            sum = sum + reminder;
        }
        System.out.println(sum);
    }
}
