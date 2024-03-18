//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;
import java.util.*;

// Link to HackerRank: https://www.hackerrank.com/challenges/java-strings-introduction/problem

public class JavaStringIntoduction {
    public static void main(String[] args) {
        /*
        Given two strings of lowercase English letters,
         perform the following operations:

          1). Sum the lengths of A and B;
          2). Determine if is lexicographically larger than (i.e.: does come before
            in the dictionary?).
          3). Capitalize the first letter in A and B
           and print them on a single line, separated by a space.
         */
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */


        // 1). Sum the lengths of A and B;
        System.out.println(" 1). Sum the lengths of A and B: ");
        int a_length = A.length();
        int b_length = B.length();

        System.out.println("The sum the lengths of " + "/'" + A + "'/" +  " and " + "/'" + B + "'/" +": " + (a_length + b_length));

        // 2). Determine if is lexicographically larger than (i.e.: does come before
        //            in the dictionary?).
        System.out.println("2). Determine if is lexicographically larger than (i.e.: does come before\n" +
                "in the dictionary?).");
        System.out.println("Is A larger B: " + A.compareTo(B));

        if(A.compareTo(B) == 0){
            System.out.println("Yes");
        }
        System.out.println("No");

        // 3). Capitalize the first letter in A and B
        //  and print them on a single line, separated by a space.
        System.out.println("3). Capitalize the first letter in A and B\n" +
                "and print them on a single line, separated by a space.");
        String s1 = A.substring(0, 1).toUpperCase();
        String s11 = A.substring(1);
        String s2 = B.substring(0, 1).toUpperCase();
        String s22 = B.substring(1);

        System.out.println(s1 + s11 + " " + s2 + s22);


//        String s = "javatpoint";
//        System.out.println(s);
//        String s1 = s.substring(0, 1).toUpperCase();  // first letter = J
//        System.out.println(s1);
//        String s2 = s.substring(1);     // after 1st letter = avatpoint
//        System.out.println(s2);
//        String res = s.substring(0, 1).toUpperCase() + s.substring(1); // J + avatpoint
//        System.out.println(res);
    }
}