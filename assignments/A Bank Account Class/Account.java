// header
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and System.out.print a summart of the account.

public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    
    // Constructor -- initializes balance, owner, and account number
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    
    //  Checks to see if balance is sufficient for withdrawl.
    // If so, decrements balance by amoint; if not, System.out.prints message.
    public void withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    
    // Adds deposit amount to balance.
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    // Returns balance. 
    public double getBalance()
    {
        return balance;
    }
    
    // Prints name, account number, and balance
    public void printSummary()
    {
        // System.out.print name
        System.out.println("Account name: " + name);
        // System.out.print acct number
        System.out.println("Account number: " + acctNum);
        // System.out.print balance
        System.out.println("Account balance: $" + balance);
    }
    
    // Deducts $10 service fee if balance is under $1000
    public double chargeFee()
    {
        if(balance < 1000.0)
        {
            System.out.println("**Balance is less than $1000, you will be charged with a $10 service fee.");
            balance -= 10.0;
        }
        else
        {
            System.out.println("No fee charge since balance is greater than or equal to $1000.");
        }
        return balance;
    }
    
    // Changes the name on the account
    public void changeName(String newName)
    {
        name = newName;
    }
} // end of class