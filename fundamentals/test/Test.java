import java.util.ArrayList;

public class Test {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("first");
    System.out.println(arrayList);
    arrayList.add(0, "second");
    System.out.println(arrayList);
    
  }
}