import java.util.*;

public class Anagrams {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String S1 = sc.nextLine();
         String S2 = sc.nextLine();
         S1 = S1.toLowerCase();
         S2 = S2.toLowerCase();
         if(S1.length()!=S2.length()) {
             System.out.println("Not Anagrams");
         } else {
             char[] str1 = S1.toCharArray();
             char[] str2 = S2.toCharArray();
             Arrays.sort(str1);
             Arrays.sort(str2);
             if(Arrays.equals(str1,str2)==true) {
                 System.out.println("Anagrams");
             } else {
                 System.out.println("Not Anagrams");
             }
         }
         sc.close();
     }    
}
