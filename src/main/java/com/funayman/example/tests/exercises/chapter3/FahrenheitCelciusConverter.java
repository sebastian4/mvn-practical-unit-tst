public class FahrenheitCelciusConverter {

  public static int toFahrenheit(int c) {
  	int nine = 9;
    return c * nine / 5 + 32;
  }

  public static int toCelcius(int f) {
    return (f - 32) * 5 / 9;
  }
}
