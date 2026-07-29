package math_sums;
import java.util.Scanner;
public class bank_balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account balance:");
        int bal = sc.nextInt(); //5000
        int total_attempt = 3;
        for (int atmpt = 1; total_attempt >= atmpt; atmpt++) { //3>=1
            System.out.println("Enter the withdraw amount:");
            int withdraw = sc.nextInt();//3000

            if (withdraw > bal) { //3000 > 5000
                if (atmpt == total_attempt) { //1 == 3
                    System.out.println("Insufficient balance");
                    System.out.println("You ran out of attempt:");
                }
                else {
                    System.out.println("Insufficient balance:");
                }
            }
            else {
                int total_bal = bal - withdraw; // 5000 - 3000=1500
                System.out.println("Amount withdraw:" + withdraw);
                System.out.println("Total Balance" + total_bal);
                break;
            }
        }
    }
}

