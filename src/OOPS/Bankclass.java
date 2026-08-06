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
        System.out.println(wd+" is withdraw from your account");
    }
    public void Deposit(double dp){
        Balance=Balance+dp;
        System.out.println(dp+" Credited to your account");
    }

    static void main() {
        Bankclass bc=new Bankclass(123,"muneera",998.45,"savnig");
        bc.setAccountno(455);
        bc.setBalance(1000.00);
        bc.setHoldername("parveen");
        bc.withdraw(654.34);
        bc.Deposit(2500.98);

    }

}
