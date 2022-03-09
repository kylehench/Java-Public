public class CafeJava {
  public static void main(String[] args) {
    // APP VARIABLES
    // Lines of text that will appear in the app. 
    String generalGreeting = "Welcome to Cafe Java, ";
    String displayTotalMessage = "Your total is $";
    String pendingMessage = ", your order will be ready shortly";
    String readyMessage = ", your order is ready";
    
    // Menu variables
    double mochaPrice = 3.5;
    double dripCoffeePrice = 2;
    double lattePrice = 4;
    double cappucinoPrice = 4;

    // Customer name variables
    String customer1 = "Cindhuri";
    String customer2 = "Sam";
    String customer3 = "Jimmy";
    String customer4 = "Noah";

    // Order completions
    boolean isReadyOrder1 = false;
    boolean isReadyOrder2 = false;
    boolean isReadyOrder3 = false;
    boolean isReadyOrder4 = true;

    // APP INTERACTION SIMULATION (Add your code for the challenges below)
    // Customer interaction #1:
    System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    System.out.println(displayTotalMessage + dripCoffeePrice);
    System.out.println(customer1 + pendingMessage);
    System.out.println(" ");
    if (isReadyOrder4) {
      System.out.println(customer4 + readyMessage);
    } else {
      System.out.println(customer4 + pendingMessage);
    }
    System.out.println(" ");
    System.out.println(generalGreeting + customer2);
    System.out.println(displayTotalMessage + lattePrice*2);
    if (isReadyOrder2) {
      System.out.println(customer2 + readyMessage);
    } else {
      System.out.println(customer2 + pendingMessage);
    }
    System.out.println(" ");
    System.out.println(generalGreeting + customer3);
    System.out.println(displayTotalMessage + (lattePrice-dripCoffeePrice));
  }
}