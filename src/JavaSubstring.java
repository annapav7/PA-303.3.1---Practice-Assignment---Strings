import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Link to HackerRank: https://www.hackerrank.com/challenges/java-substring/problem
public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String s1 = S.substring(start, end);
        System.out.println(s1);
    }
}
