import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Successfully deposited ₹" + amount);
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Successfully withdrawn ₹" + amount);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        int choice;

        do {
            System.out.println("\n====== 🏦 BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("👉 Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    String accNum = sc.nextLine();
                    System.out.print("Enter initial balance: ₹");
                    double balance = sc.nextDouble();
                    account = new BankAccount(name, accNum, balance);
                    System.out.println("🎉 Account created successfully!");
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ₹");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                    } else {
                        System.out.println("⚠️ Please create an account first!");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ₹");
                        double wd = sc.nextDouble();
                        account.withdraw(wd);
                    } else {
                        System.out.println("⚠️ Please create an account first!");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("⚠️ Please create an account first!");
                    }
                    break;

                case 5:
                    System.out.println("👋 Thank you for using the Bank System!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again!");
            }
        } while (choice != 5);

        sc.close();
    }
}
