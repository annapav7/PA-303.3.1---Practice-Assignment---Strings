/*
Given a string, , matching the regular expression [A-Za-z !,?._'@]+,
split the string into tokens. We define a token to be one or more
consecutive English alphabetic letters. Then, print the number of
tokens, followed by each token on a new line.
 */
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class JavaStringTokens {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] splitString = (s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,?._'@]+"));
        System.out.println(splitString.length);

        for (String string : splitString) {
            System.out.println(string);
        }
    }
}
