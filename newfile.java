public class BankAccount {
    private int balance;
    private static String bankName;
    private static int accountCount = 0;

    static {
        bankName = "Bank of America";
        System.out.println("Bank name: " + bankName);
    }

    public BankAccount(int balance) {
        this.balance = balance;
        accountCount++;
    }

    public int getBalance() {
        return this.balance;
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        this.balance += amount;
        System.out.println("Deposited " + amount + " to account " + this.balance);
    }

    public void 
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);
        BankAccount account3 = new BankAccount(3000);

        System.out.println("Total accounts: " + BankAccount.getAccountCount());
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 balance: " + account2.getBalance());
        System.out.println("Account 3 balance: " + account3.getBalance());
    }
}