import org.junit.Test;

public class AccountNullExceptionTest {

    @Test(expected = Exception.class)
    public void AccountReturnsExceptionWithNull() {
        new Account(null);
    }
}
