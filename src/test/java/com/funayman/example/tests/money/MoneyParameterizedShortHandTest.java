package com.funayman.example.tests.money;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedShortHandTest {

  private static final Object[] getMoney() {
    return $(
      $(10, "USD"),
      $(20, "EUR")
    );
  }

  @Test
  @Parameters(method = "getMoney")
  public void constructorShouldSetAmountAndCurrency(
      int amount, String currency) {
    Money money = new Money(amount, currency);

    assertEquals(amount, money.getAmount());
    assertEquals(currency, money.getCurrency());
  }
}
