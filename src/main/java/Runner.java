import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {

        BankAccount harrysAccount = new BankAccount("Harry", "Masini", LocalDate.of(1999
                ,8,5), 12345678, "savings", 1000);

        harrysAccount.deposit(120000.86);
        harrysAccount.withdraw(14773.71);
        harrysAccount.payInterst();
        harrysAccount.withdraw(2000.65);

        BankAccount bobsAccount = new BankAccount("Bob", "Smith", LocalDate.of(1900,4
                ,3), 13232321, "Current",1000);

        bobsAccount.deposit(2000.34);
        bobsAccount.payInterst();
        bobsAccount.payInterst();
        bobsAccount.withdraw(544.40);
    }
}
