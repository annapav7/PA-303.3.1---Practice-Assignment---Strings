
/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string, print Yes if it is a palindrome, print No otherwise.
 */
import java.io.*;
import java.util.*;
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

//        for (int i = 0; i < A.length() / 2; i++) {
//            if (A.charAt(i) == A.charAt(A.length() - i - 1)) {
//                System.out.println("Yes");
//
//        } else {
//                System.out.println("No");
//                }
//            }
        String s = "";
        for(int i = A.length()-1;  i >= 0; i--){
            s = s +  A.charAt(i);
        }
        if(A.equals(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        }
    }

