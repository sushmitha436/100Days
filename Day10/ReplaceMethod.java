import java.util.*;

public class ReplaceMethod {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String S1 = sc.nextLine();
         String S2 = sc.nextLine();
         String S3 = sc.nextLine();
         System.out.println(S1.replace(S2,S3));  // it replaces the S2 string/character with S3 string/charcter in String S1. 
    
        sc.close();
     }    
}
