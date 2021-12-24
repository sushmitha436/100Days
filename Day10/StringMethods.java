 import java.util.*;

public class StringMethods {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String str2 = sc.nextLine();
            System.out.println(str.equals(str2));   // it returns true if content of two strings are equal.
            System.out.println(str.equalsIgnoreCase(str2));
                  // java is case-sensitive.the above method return true if content of two strings are equal,irrespective of case(lower/upper) of strings.
            System.out.println(str.isEmpty());    //it retturns true if string is empty,otherwise false.                 
        }     

}
