import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    private BankAccount acc;
    @BeforeEach
    public void setUp(){
        acc = new BankAccount("Harry", "Masini", LocalDate.of(1999
                ,8,5), 12345678, "savings", 1000);
    }


    @Test
    public void testDeposit(){

        assertThat(acc.getBalance() == 0);
        acc.deposit(10000.54);
        assertThat(acc.getBalance() == 10000.54);
        acc.deposit(1000.454);
        assertThat(acc.getBalance() == 10000.54);
    }
    @Test
    public void testWithdraw(){

        assertThat(acc.getBalance() == 0);
        acc.withdraw(100.54);
        assertThat(acc.getBalance() == -100.54);
        acc.withdraw(10000);
        assertThat(acc.getBalance() == -100.54);
    }
    @Test
    public void testPayInterest(){
        assertThat(acc.getBalance() == 0);
        acc.deposit(1000);
        acc.payInterst();
        assertThat(acc.getBalance() == 1050);
    }


}
