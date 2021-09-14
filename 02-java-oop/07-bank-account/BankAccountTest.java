public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.deposit(true, 300.00);
        myAccount.deposit(true, 30.00);
        myAccount.withdraw(false, 400.00);
        myAccount.withdraw(true, 250.00);
        myAccount.viewTotalAccountBalance();
    }
    
}
