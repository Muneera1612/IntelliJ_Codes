package Oops_Pillars;

import java.util.Scanner;
public class BankAccount_interface {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Bank b=new Bank();
        b.setAc_no(7576);
        b.setBal(78.98);
        b.setName("Muneera");
        b.getAmount();
        b.deposit_amount();
        b.withdraw_amount();
        b.check_bal();

    }
    public interface Deposit{
        //void person_details();
        void deposit_amount();
        //void total_amount();
    }
    interface Withdraw{
        void withdraw_amount();
    }
    interface Balance{
        void check_bal();
    }
    static class Bank implements Deposit,Withdraw,Balance{
        private String name;
        private int ac_no;
        private double bal;
int amount;
        double deposit;
        double withdraw;
        public void setAc_no(int ac_no) {
            this.ac_no = ac_no;
        }
        public int getAc_no() {
            return ac_no;
        }
        public int getAmount(){
            return amount;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setBal(double bal){
            this.bal=bal;
        }
        public double getBal() {
            return bal;
        }
        @Override
        public void check_bal() {
            System.out.println(bal);
        }
        @Override
        public void deposit_amount() {
            bal=bal+deposit;
            System.out.println(bal);
        }
        @Override
        public void withdraw_amount() {
            bal=bal-withdraw;
            System.out.println(bal);
        }
    }
}
