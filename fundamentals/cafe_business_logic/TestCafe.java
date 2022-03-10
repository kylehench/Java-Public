import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
  public static void main(String[] args) {
    CafeUtil cafeUtil = new CafeUtil();
    ArrayList<String> cafeUtilMethodNames = new ArrayList<>(
      Arrays.asList("Streak Goal", "Order Total", "Display Menu", "Add Customer", "Price Chart", "Display Menu II"));
    
    System.out.println("\n-----" + cafeUtilMethodNames.get(0) + "-----");
    System.out.println("Total Drinks: " + cafeUtil.getStreakGoal(10));

    System.out.println("\n-----" + cafeUtilMethodNames.get(1) + "-----");
    double[] prices = {2.30, 4.50, 3.25, 1.70};
    System.out.println("Total Price: " + cafeUtil.getOrderTotal(prices));

    System.out.println("\n-----" + cafeUtilMethodNames.get(2) + "-----");
    ArrayList<String> menu = new ArrayList<>(
      Arrays.asList("Drip Coffee", "Latte", "Americano"));
    cafeUtil.displayMenu(menu);
    
    System.out.println("\n-----" + cafeUtilMethodNames.get(3) + "-----");
    ArrayList<String> customers = new ArrayList<>(
      Arrays.asList("Bob", "Jill", "Kenny", "Janet"));
      cafeUtil.addCustomer(customers);
      
      System.out.println("\n-----" + cafeUtilMethodNames.get(4) + "-----");
      cafeUtil.printPriceChart("Columbian Coffee Grounds", 15.0, 3);

    System.out.println("\n-----" + cafeUtilMethodNames.get(5) + "-----");
    ArrayList<Double> prices2 = new ArrayList<>(
      Arrays.asList(2.20, 3.50, 3.20));
    cafeUtil.displayMenu(menu, prices2);
    }
}