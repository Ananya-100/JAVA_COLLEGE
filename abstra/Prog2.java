import java.util.*;
class Account{
    String name;
    String ACC_typ;
    int ac_no;
    double balance;
    Account(String name,String ACC_typ,int ac_no,double balance){
        this.name = name;
        this.ACC_typ = ACC_typ;
        this.ac_no = ac_no;
        this.balance = balance;
    }
    void deposists(double amt){
        balance = balance+amt;
    }
    void displayBalance() {
        System.out.println("Account Balance: Rs." + balance);
    }

}
class Savings extends Account{
    double intrest;
    Savings(String name,String ACC_typ,int ac_no,double balance,double intrest){
        super(name, ACC_typ, ac_no,balance);
        this.intrest = intrest;
    }
    void computeInterest() {
        double interest = balance * intrest *100;
        balance += intrest;
        System.out.println("Interest of Rs." + interest + " added to account");
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
class Curr_Acct extends Account {
    double minBalance;
    double penalty;

    Curr_Acct(String name, String ACC_typ,int ac_no, double balance,double minBal, double penalty) {
        super(name,ACC_typ,ac_no,balance);
        minBalance = minBal;
        this.penalty = penalty;
    }

    void checkMinBalance() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Minimum balance not maintained. Penalty imposed: Rs." + penalty);
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Prog2 {
    public static void main(String[] args) {
         Scanner sc  = new Scanner(System.in);
         System.out.println("Enter Customer name, account type,account no.,balance present");
         String c = sc.nextLine();
         String typ = sc.nextLine();
         int ac = sc.nextInt();
         double b = sc.nextDouble();
         
         Account a = new Account(c, typ, ac, b);

         a.displayBalance();

    }
   
    


}
