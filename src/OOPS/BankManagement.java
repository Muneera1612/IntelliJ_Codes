package OOPS;

import java.util.Scanner;

public class BankManagement {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        //bank management
        Bankclass bc = new Bankclass(12345, "Muneera", 5000.00, "Savings");
        //output
        System.out.println("______Bank Management______");
        System.out.println("1) Create Account:");
        System.out.println("2) Deposit Money");
        System.out.println("3) Withdraw Money");
        System.out.println("4) Check Balance");
        System.out.println("5) View Account Details");
        System.out.println("6) Exit");

        System.out.println("Enter the choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("----Create Account----");
                System.out.println("Enter the account no");
                int Accoutno = sc.nextInt();
                System.out.println("Enter the name");
                var Name = sc.nextLine();
                System.out.println("Enter the account initial balance:");
                double Balance = sc.nextDouble();
                System.out.println("Enter the account type:");
                String Ac_type = sc.nextLine();

            default:
                System.out.println("Invalid");
        }
    }
}
