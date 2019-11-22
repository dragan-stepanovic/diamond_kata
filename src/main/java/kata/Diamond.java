package kata;

import static org.apache.commons.lang.StringUtils.repeat;

import edu.emory.mathcs.backport.java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diamond {

  private static final String NEW_LINE = "\n";
  private static final String SPACE = " ";
  private static final List<String> letters = Arrays.asList("A", "B", "C", "D");

  public static String forLetter(String widestLetter) {
    String diamond = rowFor(widestLetter);
    for (String letter : inReverseStartingFrom(widestLetter)) {
      diamond = rowFor(letter, widestLetter) + diamond + rowFor(letter, widestLetter);
    }
    return removeLastNewLineFrom(diamond);
  }

  private static List<String> inReverseStartingFrom(String widestLetter) {
    List<String> reversedLetters = listUntil(widestLetter);
    Collections.reverse(reversedLetters);
    return reversedLetters;
  }

  private static ArrayList<String> listUntil(String widestLetter) {
    return new ArrayList<>(letters.subList(0, letters.indexOf(widestLetter)));
  }

  private static String removeLastNewLineFrom(String result) {
    return result.substring(0, result.length() - 1);
  }

  private static String rowFor(String letter, String widestLetter) {
    return outerSpace(widestLetter, letter) + lettersWithInnerSpace(letter) + outerSpace(widestLetter, letter)
        + NEW_LINE;
  }

  private static String rowFor(String widestLetter) {
    return rowFor(widestLetter, widestLetter);
  }

  private static String outerSpace(String widestLetter, String currentLetter) {
    return repeat(SPACE, letters.indexOf(widestLetter) - letters.indexOf(currentLetter));
  }

  private static String lettersWithInnerSpace(String letter) {
    return letter.equals("A") ? "A" : letter + repeat(SPACE, letters.indexOf(letter) * 2 - 1) + letter;
  }
}
