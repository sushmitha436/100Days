import java.util.*;
import java.io.*;

public class Test4 {
   public static void main(String[] args) {
       String S  = null;

       try {
           System.out.println(S.charAt(1));
       }
      catch(NullPointerException e) {
         System.out.println(e);
      }
      finally {
          System.out.println("Next Statement");
      }
   }    
}
