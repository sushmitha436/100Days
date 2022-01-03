import java.util.*;

public class Test2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String S = sc.nextLine();
       int A = sc.nextInt();
       sc.close();

       try {
           System.out.println(S.charAt(A));
       } 

       catch(StringIndexOutOfBoundsException e) {
           System.out.println(e);

       } 

       catch(ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
       }
   }    
}
