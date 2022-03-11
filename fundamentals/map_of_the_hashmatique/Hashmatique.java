import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
  public static void main(String[] args) {
    HashMap<String, String> songs = new HashMap<String, String>();
    songs.put("First Up", "I love to draw happy clouds");
    songs.put("The Second", "I'm the second, yes I am. Younger sibling?");
    songs.put("Yet Another Title", "third in line");
    songs.put("Number Four", "I hope people are still listening...");

    System.out.println(songs.get("Yet Another Title")+ "\n");
    Set<String> songKeys = songs.keySet();
    for (String key : songKeys) {
      System.out.println(key + ": " + songs.get(key));
    }
  }
}
