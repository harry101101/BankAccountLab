import org.decimal4j.util.DoubleRounder;
import java.time.LocalDate;
public class BankAccount {

    //Attributes
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int accountNumber;
    private double balance = 0;
    private String accountType;
    private int overdraft;

    //Constructor
    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, String accountType, int overdraft) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountType = accountType;
        this.overdraft = overdraft;

    }

    //Methods
    void deposit(double amount) {
        System.out.println("Account holder: " + firstName + " " + lastName);
        if ((amount * 100) % 1 == 0) {
            balance += amount;
            System.out.println("£" + DoubleRounder.round(amount, 2) + " deposited. New balance £" + DoubleRounder.round(balance, 2) + ".");
        } else {
            System.out.println("Deposit amount invalid.");
        }
    }

    void withdraw(double amount) {
        System.out.println("Account holder: " + firstName + " " + lastName);
        if ((amount * 100) % 1 == 0) {
            if ((balance - amount) >= -overdraft) {
                balance -= amount;
                System.out.println("£" + DoubleRounder.round(amount, 2) + " withdrawn. New balance £" + DoubleRounder.round(balance, 2) + ".");
            } else {
                System.out.println("Transaction exceeds overdraft. Transaction cannot be done.");
            }
        } else {
            System.out.println("Withdrawal amount invalid.");
        }
    }

    void payInterst() {
        System.out.println("Account holder: " + firstName + " " + lastName);
        if (accountType.toLowerCase().equals("savings")) {
            balance *= 1.05;
            System.out.println("£" + DoubleRounder.round((balance * 0.05), 2) + " (5%) interest paid on your savings account. New balance: £" + DoubleRounder.round(balance, 2));
        } else if (accountType.toLowerCase().equals("current")) {
            balance *= 1.03;
            System.out.println("£" + DoubleRounder.round((balance * 0.03), 2) + " (3%) interest paid on your current account. New balance: £" + DoubleRounder.round(balance, 2));
        } else {
            System.out.println("Invalid account type, no interest paid.");
        }
    }

    //Getters and Setters
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate newDateOfBirth) {
        this.dateOfBirth = newDateOfBirth;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccountType(String newAccountType) {
        this.accountType = newAccountType;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public void setOverdraft(int newOverdraft) {
        this.overdraft = newOverdraft;
    }

    public int getOverdraft() {
        return this.overdraft;
    }

}