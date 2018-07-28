
/* 
Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.

Eg. For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.

For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"


*/

import static java.lang.System.*;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class YourOrderPls {
    private static String sortWords(String words) {
        String[] splitWords = words.split(" ");
        Pattern pattern = Pattern.compile("[1-9]");
        String[] sortedWords = new String[splitWords.length];
        for (String word : splitWords) {
            Matcher match = pattern.matcher(word);
            while (match.find()) {
                int number = Integer.parseInt(match.group());
                sortedWords[number - 1] = word;
            }
        }
        return String.join(" ", sortedWords);
    }

    private static String order(String words) {
        if (words.length() == 0) {
            return "";
        } else {
            return sortWords(words);
        }
    }

    public static void main(String... args) {
        String input = "is2 Thi1s T4est 3a";
        out.println(order(input));
    }
}