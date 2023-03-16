// header
// Uses Account class to create and manage Sally and Joe's bank accounts.

// import Account;
public class ManageAccounts
{
    public static void main (String[] args)
    {
        Account acct1, acct2;
        
        // create account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);
        
        // create account2 for Joe with $500
        acct2 = new Account(500, "Joe", 9999);
        
        // deposit $100 to Joe's account
        acct2.deposit(100.0);
        
        // System.out.print Joe's new balace (use getBalance())
        System.out.println("Joe's new balance after the $100 deposit is $" + acct2.getBalance());
        acct2.chargeFee(); // charge fees to both accounts
        System.out.println();
        
        // withdraw $50 from Sally's account
        acct1.withdraw(50.0);
        
        // System.out.print Sally's new balace (use getBalance())
        System.out.println("Sally's new balance after the $50 withdraw is $" + acct1.getBalance());
        acct1.chargeFee(); // charge fees to both accounts
        System.out.println();
        
        // change the name on Joe's account to Joseph
        acct2.changeName("Joseph");
        
        // System.out.print summary for both accounts
        System.out.println("------Summary------");
        acct1.printSummary();
        acct2.printSummary();
        
    } // end of main method
} // end of class

