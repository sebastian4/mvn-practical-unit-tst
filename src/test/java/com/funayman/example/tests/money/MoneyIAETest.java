import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class MoneyIAETest {

  private static final int VALID_AMOUNT = 10;
  private static final String VALID_CURRENCY = "USD";

  private static final Object[] getInvalidAmount() {
    return new Integer[][] {
      { -1234 },
      { -5 },
      { -1 }
    };
  }

  public static final Object[] getInvalidCurrency() {
    return new String[][] {
      { null },
      { "" }
    };
  }

  @Test(expected = IllegalArgumentException.class)
  @Parameters(method = "getInvalidAmount")
  public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) {
    new Money(invalidAmount, VALID_CURRENCY);
  }

  @Test(expected = IllegalArgumentException.class)
  @Parameters(method = "getInvalidCurrency")
  public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency) {
    new Money(VALID_AMOUNT, invalidCurrency);
  }
}
