public class Account 
{
    double balance;

    Account(double bal)
    {
        this.balance = bal;
    }

    public double showBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if(amount>=500)
        {
            balance+=amount;
            System.out.println("Deposited : ₹ "+amount);
        }
        else
        {
            System.out.println("Cannot Be Deposited Through ATM . ");
        }
    }

    public boolean withdraw(double amount)
    {
        if(amount>=1000 && balance>amount)
        {
            balance-=amount;
            System.out.println("Money Withdraw : "+amount);
            return true;
        }
        else
        {
            System.out.println("Insufficient Funds For Withdraw");
        }
        return false;
    }


}
