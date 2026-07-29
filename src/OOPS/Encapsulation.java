
package OOPS;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;

class Encapsulation {

    //BankAccount
    private double balance;
    public void Bankaccount(double balance){
        this.balance=balance;
    }
    public void Choices(int choice,double amount){
        switch (choice){
            case 1:
                balance+=amount;
                System.out.println("Deposited "+ balance);
                break;

            case 2:
                if(amount<=balance){
                    balance-=amount;
                    System.out.println("Withdraw "+ balance);
                }else{
                    System.out.println("Insufficient balance ");
                }
                break;
            case 3:
                System.out.println("Current balance "+balance);
                break;

            default:
                System.out.println("Invalid Balnce");
        }
    }

    static void main(String[] args){
        System.out.println("1 Deposit");
        System.out.println("2 Withdraw");
        System.out.println("3 Balance enquiry");
        Encapsulation ec=new Encapsulation();
        ec.Choices(1,5000);
        ec.Choices(3,0);

    }
}



/*public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
        }
    }
    public double getBalance() {
        return balance;
}

 */