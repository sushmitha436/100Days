import java.util.*;

public class Comparision {
      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String s1 = sc.next();
           String s2 = sc.next();
           String s3 = sc.next();
           System.out.println(s1.compareTo(s2));  // it returns 0 or positive or negative numbers.
           System.out.println(s2.compareTo(s3));  // if two strings are lexigraphically equal,it returns 0.
      }                                           // if first string is greater than compared string it returns positive number. (lexicographically)         
}                                                 // if first string is less than compared string it returns negative number. (lexicographically)         
