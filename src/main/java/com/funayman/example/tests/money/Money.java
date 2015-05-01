public class Money {

  private final int amount;
  private final String currency;

  public Money(int amount, String currency) {
    if (amount < 0) {
      throw new IllegalArgumentException(
        String.format("illegal amount: [ %d ]", amount) );
    }

    if (currency == null || currency.isEmpty()) {
      throw new IllegalArgumentException(
        String.format("illegal currency: [ %d ]", currency) );
    }

    this.amount = amount;
    this.currency = currency;
  }

  public int getAmount() {
    return this.amount;
  }

  public String getCurrency() {
    return this.currency;
  }

  public boolean equals(Object o) {
    if (o instanceof Money) {
      Money money = (Money) o;

      return money.getCurrency().equals(getCurrency())
        && money.getAmount() == getAmount();
    }

    return false;
  }
}
