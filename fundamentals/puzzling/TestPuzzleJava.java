import java.util.Arrays;
import java.util.ArrayList;

public class TestPuzzleJava {
  public static void main(String[] args) {
    PuzzleJava puzzleJava = new PuzzleJava();

    System.out.println("----- Get Ten Rolls -----");
    int[] randArray = puzzleJava.getTenRolls();
    System.out.println(Arrays.toString(randArray));
    
    System.out.println("\n----- Get Random Letter -----");
    System.out.println(puzzleJava.getRandomLetter());
    
    System.out.println("\n----- Generate Password -----");
    System.out.println(puzzleJava.generatePassword());
    
    System.out.println("\n----- Generate Passwords -----");
    ArrayList<String> passwords = puzzleJava.getNewPasswordSet(8);
    for (String password : passwords) {
      System.out.println(password);
    }
    
    System.out.println("\n----- Shuffle Array -----");
    ArrayList<String> array = new ArrayList<>(
      Arrays.asList("String1", "String2", "String3", "String4", "String5", "String6", "String7"));
    ArrayList<String> shuffledArray = puzzleJava.shuffleArray(array);
    for (String stringy : array) {
      System.out.println(stringy);
    }
  }
}