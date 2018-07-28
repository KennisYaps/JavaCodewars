
/* 
Remove the vowels in a sting. 
Eg. the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
*/

import static java.lang.System.*;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Disemvowel_Trolls {
    public static String disemvowel(String str) {
        Pattern regexPattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher m = regexPattern.matcher(str);
        return m.replaceAll("");
    }

    public static void main(String[] args) {
        out.println("Hello");
        out.println(disemvowel("Hello baby"));

    }
}

// Other people answer
/*
 public class Troll { 
    public static String disemvowel(String str) { 
       return str.replaceAll("(?i)[aeiou]" , ""); 
    } 
}
 */