import java.util.Scanner;
class BankAccount
{
    static double initial;
    double balance;
    double d_amount;
    double w_amount;

    BankAccount(double initial)
    {
        this.initial=initial;
        balance=initial;
    }
    void deposit(double d_amount)
    {
        balance+=d_amount;
    }
    boolean withdraw(double w_amount)
    {
        if(balance-w_amount>=0)
        {
            balance-=w_amount;
            return true;
        }
        else
            return false;
    }
    double checkBalance()
    {
        return balance;
    }
}

class ATM extends BankAccount
{
    ATM(BankAccount b)
    {
        super(initial);
    }
    void a_deposit(double d_amount)
    {
        super.deposit(d_amount);
        System.out.println("Successfully deposited!!");
        System.out.println();
    }
    void a_withdraw(double w_amount)
    {
        if(super.withdraw(w_amount))
        {
            System.out.println("Successfully withdrawn!!");
            System.out.println();
        }
        else
        {
            System.out.println("Insufficient balance!!");
            System.out.println();
        }
    }
    void a_checkBalance()
    {
        super.checkBalance();
        System.out.println("Currenct balance: "+ balance);
        System.out.println();
    }
}

public class Task3
{
    public static void main(String[] args) 
    {    
        Scanner sc=new Scanner(System.in);
        System.out.print("Initial balance: ");
        double initial=sc.nextDouble();
        BankAccount b=new BankAccount(initial);
        ATM a=new ATM(b);
        
        while (true) 
        {
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check balance");
            System.out.print("Enter choice:");
            int ch=sc.nextInt();

            switch (ch) 
            {
                case 1: System.out.print("Enter deposit amount: ");
                        double d_amount=sc.nextDouble();
                        a.a_deposit(d_amount);
                        break;

                case 2: System.out.print("Enter withdraw amount: ");
                        double w_amount=sc.nextDouble();
                        a.a_withdraw(w_amount);
                        break;

                case 3: a.a_checkBalance();
                        break;

                default: System.out.println("Invalid input!!");
                         System.exit(0);                 
            }
        }
    }
}
