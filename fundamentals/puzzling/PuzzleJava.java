import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class PuzzleJava {
  Random randMachine = new Random();

  int[] getTenRolls() {
    int[] randArray = new int[10];
    for (int i = 0; i < randArray.length; i++) {
      randArray[i] = randMachine.nextInt(20)+1;
    }
    return randArray;
  }

  char getRandomLetter() {
    char charmander = (char)(97+randMachine.nextInt(26));
    return charmander;
  }

  String generatePassword() {
    String password = "";
    for (int i = 0; i < 8; i++) {
      password = password.concat(Character.toString(getRandomLetter()));
    }
    return password;
  }

  ArrayList<String> getNewPasswordSet(int length) {
    ArrayList<String> passwords = new ArrayList<String>();
    for (int i = 0; i < length; i++) {
      passwords.add(generatePassword());
    }
    return passwords;
  }

  ArrayList<String> shuffleArray(ArrayList<String> array) {
    int maxIdx = array.size()-1;
    for (int i = 0; i < array.size()*10; i++) {
      int idx1 = randMachine.nextInt(maxIdx);
      int idx2 = randMachine.nextInt(maxIdx);
      String value1 = array.get(idx1);
      array.set(idx1, array.get(idx2));
      array.set(idx2, value1);
    }
    return array;
  }
  
}
