import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
public class CafeUtil {
  int getStreakGoal(int numWeeks) {
    int drinkCountCurrent = 1;
    int drinkCountTotal = 0;
    while (drinkCountCurrent <= numWeeks) {
      drinkCountTotal += drinkCountCurrent;
      drinkCountCurrent++;
    }
    return drinkCountTotal;
  }
  double getOrderTotal(double[] prices) {
    double total = 0;
    for (int i = 0; i < prices.length; i++) {
      total += prices[i];
    }
    return total;
  }
  void displayMenu(ArrayList<String> menuItems) {
    for (int i = 0; i < menuItems.size(); i++) {
      System.out.println(i + " " + menuItems.get(i));
    }
  }
  void addCustomer(ArrayList<String> customers) {
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello, " + userName + "!");
    System.out.println("There are " + customers.size() + " people in front of you.");
    customers.add(userName);
    System.out.println(String.join(", ", customers));
  }
  void printPriceChart(String product, double price, int maxQuantity) {
    Locale usa = new Locale("en", "US"); // US locale
    NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa); // $ formatter
    System.out.println(product);
    for (int i = 1; i <= maxQuantity; i++) {
      System.out.println(i + " - " + dollarFormat.format(i*(price-0.5)+0.5));
    }
  }
  boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
    Locale usa = new Locale("en", "US"); // US locale
    NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa); // $ formatter
    if (menuItems.size() != prices.size()) {
      return false;
    }
    for (int i = 0; i < menuItems.size(); i++) {
      System.out.println(i + " " + menuItems.get(i) + " -- " + dollarFormat.format(prices.get(i)));
    }
    return true;
  }
}