package OOPS;

class Bankclass {
    private int Accountno;
    String Name;
    private double Balance;
    public String Ac_type;

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setHoldername(String name) {
        Name = name;
    }

    public int getAccountno() {
        return Accountno;
    }

    public void setAccountno(int accountno) {
        Accountno = accountno;
    }
    public Bankclass(int accountno,String name,double balance,String ac_type){
        Accountno=accountno;
        Name=name;
        Balance=balance;
        Ac_type=ac_type;
    }
    public void withdraw(double wd){
        Balance=Balance-wd;
        System.out.println(wd+"is withdraw from your account");
    }
    public void Deposit(double dp){
        Balance=Balance+dp;
        System.out.println(dp+"Credit to your account");
    }

}
