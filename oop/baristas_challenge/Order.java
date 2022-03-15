import java.util.ArrayList;
public class Order {
  private String name;
  private boolean ready;
  private ArrayList<Item> items = new ArrayList<Item>();

  public Order() {
    name = "Guest";
  }
  public Order(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public boolean getReady() {
    return ready;
  }
  public void setReady(boolean ready) {
    this.ready = ready;
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public String getStatusMessage() {
    if (ready==false) return "Thank you for waiting. Your order will be ready soon.";
    return "Your order is ready.";
  }

  public double getOrderTotal() {
    double total = 0;
    for (Item item : items) {
      total += item.getPrice();
    }
    return total;
  }
  
  public void display() {
    System.out.println("Customer Name: " + this.name);
    for (Item item : items) {
      System.out.println(item.getName() + " - " + item.getPrice());;
    }
    System.out.println("Total: " + this.getOrderTotal() + "\n");
  }
}