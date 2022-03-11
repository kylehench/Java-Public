import java.util.ArrayList;
import java.util.Arrays;

public class ListsOfExceptions {
  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<Object>(
      Arrays.asList("13", "hello world", 48, "Goodbye World")
    );
    for (int i = 0; i < myList.size(); i++) {
      try {
        Integer castedValue = (Integer) myList.get(i);
      } catch (ClassCastException e) {
        System.out.println("\nThere was an error at this index: " + i);
        System.out.println("and at this location: " + myList.get(i));
      }
    }
  }
}