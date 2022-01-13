import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountParameterizedTest {

    private final String name;
    private final Boolean expected;

    public AccountParameterizedTest(String name, Boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Рик Декард", true},
                {"Р Д", true},
                {"Рик Декардабвгдезжи", true},
                {"Рик Декардабвгдезжик", false},
                {"Ри", false},
                {" Рик Декард", false},
                {"Рик Декард ", false},
                {" РикДекард", false},
                {"РикДекард ", false},
                {"Ри к Декард", false},
                {"Р", false},
                {"", false}
        };
    }

    @Test
    public void AccountTest() {
        Account account = new Account(name);
        Boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

}