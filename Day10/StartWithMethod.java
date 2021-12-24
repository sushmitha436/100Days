import java.util.*;

public class StartWithMethod {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String S1 = sc.nextLine();
         String S2 = sc.nextLine();
         System.out.println(S1.startsWith(S2));  // it returns true if S1 string Starts with S2 otherwise False.
         int n = sc.nextInt();
        System.out.println(S1.startsWith(S2,n)); // it returns true if string S2 presents at nth index.
        }   

}
