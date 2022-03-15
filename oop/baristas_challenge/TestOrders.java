import java.util.ArrayList;
public class TestOrders {
  public static void main(String[] args) {
    // Menu items
    Item item1 = new Item("mocha", 5.00);
    Item item2 = new Item("latte", 5.50);
    Item item3 = new Item("drip coffee", 2.25);
    Item item4 = new Item("capuccino", 5.25);
    
    // Orders
    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order("Noah");
    Order order4 = new Order("Sam");
    Order order5 = new Order("Jimmy");

    // add items to orders
    order1.addItem(item1);
    order1.addItem(item2);
    order2.addItem(item1);
    order2.addItem(item3);
    order3.addItem(item1);
    order3.addItem(item1);
    order4.addItem(item3);
    order4.addItem(item1);
    order5.addItem(item1);
    order5.addItem(item4);

    // test display() on all orders
    order1.display();
    order2.display();
    order3.display();
    order4.display();
    order5.display();

    // test setReady() on some orders
    order1.setReady(true);
    order4.setReady(true);

    // test getOrderTotal()
    System.out.println(order1.getOrderTotal());
  }
}
