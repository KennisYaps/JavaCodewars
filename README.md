# JavaCodewars

1. 
2. [ 8kyu ] Function 3 - multiplying two numbers 
#Fundamentals
https://www.codewars.com/kata/function-3-multiplying-two-numbers/train/java 

3. [ 6kyu ] Your order, please
#Fundamentals #Strings
https://www.codewars.com/kata/your-order-please/train/java 

4. [ 7 kyu ] Disemvowel Trolls
https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
#FUNDAMENTALS #STRINGS #REGULAR EXPRESSIONS #DECLARATIVE PROGRAMMING #ADVANCED LANGUAGE FEATURES

### Learnt
1. `public static Pattern compile​(String regex)`
    - Compiles the `regex` into a pattern
    - Returns: the given regular expression compiled into a pattern

2. To indicate flags with the regex pattern
    - Synxtax: `public static Pattern compile​(String regex, int flags)`
    - Parameters:
        - regex: Pattern to be compiles
        - flags:  CASE_INSENSITIVE, MULTILINE, DOTALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL, UNICODE_CHARACTER_CLASS and COMMENTS 
    - Returns: 
        - the given regular expression compiled into a pattern with the given flags

3. `str.replaceAll()` == `Pattern.compile(regex).matcher(str).replaceAll(repl)`
    - Syntax: `str.replaceAll( String regex, String replacement)`
    - Returns: the resulting `String`
    - Replaces each substring of this string that matches the given regular expression with the given replacement.
    - Parameters:
        - `regex` - the regular expression to which this string is to be matched
        - `replacement` - the string to be substituted for each match
    - Note: 
        - An invocation of this method of the form `str.replaceAll(regex, repl)` yields exactly the same result as the expression: `Pattern.compile(regex).matcher(str).replaceAll(repl)`

4. There are 2 ways to declare case insensitive.
    1.  `Pattern regexPattern = Pattern.compile("(?i)[aeiou]", Pattern.CASE_INSENSITIVE);` 
    2. `Pattern regexPattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);`