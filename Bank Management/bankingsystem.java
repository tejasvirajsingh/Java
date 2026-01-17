
    import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;
    private String accountType;

    public BankAccount(String name, String accountType, double balance) {
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
    }

    
    private String generateAccountNumber() {
        Random rand = new Random();
        int number = 100000 + rand.nextInt(900000); 
        return String.valueOf(number);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ ₹" + amount + " deposited successfully!");
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ ₹" + amount + " withdrawn successfully!");
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("👤 Name: " + name);
        System.out.println("🏷️ Account No: " + accountNumber);
        System.out.println("💳 Account Type: " + accountType);
        System.out.println("💰 Current Balance: ₹" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAccountType() {
        return accountType;
    }
}

public class bankingsystem {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n========= 🏦 BANK MANAGEMENT SYSTEM =========");
            System.out.println("1. Create New Account");
            System.out.println("2. Login to Existing Account");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("👉 Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> loginAccount();
                case 3 -> displayAllAccounts();
                case 4 -> System.out.println("👋 Thank you for using the Bank System!");
                default -> System.out.println("❌ Invalid choice. Try again!");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void createAccount() {
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account type (Saving / Current): ");
        String accType = sc.nextLine();

        System.out.print("Enter initial balance: ₹");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accType, balance);
        accounts.add(account);

        System.out.println("🎉 Account created successfully!");
        System.out.println("👤 Name: " + account.getName());
        System.out.println("💳 Account Type: " + account.getAccountType());
        System.out.println("🏷️ Your System Generated Account Number: " + account.getAccountNumber());
    }

    private static BankAccount findAccount(String accNum) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNum)) {
                return acc;
            }
        }
        return null;
    }

    private static void loginAccount() {
        sc.nextLine();
        System.out.print("Enter your Account Number: ");
        String accNum = sc.nextLine();
        BankAccount account = findAccount(accNum);

        if (account != null) {
            System.out.println("\n✅ Welcome, " + account.getName() + "!");
            System.out.println("🏷️ Account Number: " + account.getAccountNumber());
            System.out.println("💳 Account Type: " + account.getAccountType());

            int choice;
            do {
                System.out.println("\n===== 💼 Account Menu =====");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Check Balance");
                System.out.println("4. Logout");
                System.out.print("👉 Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter deposit amount: ₹");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                    }
                    case 2 -> {
                        System.out.print("Enter withdrawal amount: ₹");
                        double wd = sc.nextDouble();
                        account.withdraw(wd);
                    }
                    case 3 -> account.checkBalance();
                    case 4 -> System.out.println("🚪 Logged out successfully!");
                    default -> System.out.println("❌ Invalid choice. Try again!");
                }
            } while (choice != 4);
        } else {
            System.out.println("⚠️ Account not found! Please check your Account number.");
        }
    }

    private static void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("📭 No accounts found!");
        } else {
            System.out.println("\n===== 🧾 All Accounts =====");
            for (BankAccount acc : accounts) {
                System.out.println("👤 " + acc.getName() + " | 🏷️ " + acc.getAccountNumber() + " | 💳 " + acc.getAccountType());
            }
        }
    }
}


// this is java program for Banking managment..
