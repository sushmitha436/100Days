import java.util.*;

public class CharArrayMethod {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String S1 = sc.nextLine();
          char[] ch = S1.toCharArray();
          for(int i=0;i<ch.length;i++) {
              System.out.println(ch[i]);
          }
      }    
}
