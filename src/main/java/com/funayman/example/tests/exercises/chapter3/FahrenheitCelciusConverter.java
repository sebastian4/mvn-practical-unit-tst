public class FahrenheitCelciusConverter {

  public static int toFahrenheit(int c) {
  	int nine = 9;
  	int five = 5;
    return c * nine / five + 32;
  }

  public static int toCelcius(int f) {
    return (f - 32) * 5 / 9;
  }
}
