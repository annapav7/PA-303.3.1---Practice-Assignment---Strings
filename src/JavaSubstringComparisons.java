import java.util.Scanner;

/*
Function Description:
Complete the getSmallestAndLargest function in the editor below.
getSmallestAndLargest has the following parameters:
    string s: a string
    int k: the length of the substrings to find
Returns     string: the string ' + "\n" + ' where and are the two substrings
Input Format:
The first line contains a string denoting
The second line contains an integer denoting
Constraints consists of English alphabetic letters only (i.e., [a-zA-Z]).
 */
public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String str_current = s.substring(0, k);

        String smallest = str_current;
        String largest = str_current;

        for (int i = 1; i <= s.length() - k; i++) {
            str_current  = s.substring(i, i + k);
            //
            if (str_current.compareTo(smallest) < 0) {
                smallest = str_current;
            }
            if (str_current.compareTo(largest) >= 0) {
                largest = str_current;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string s: a string");
        String s = scan.next();
        System.out.println("Enter int k: the length of the substrings to find:");
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
        
    }
}
