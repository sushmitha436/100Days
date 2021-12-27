import java.util.*;

public class Pattern13 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       char ch = 'A';
       for(int i=1;i<=n;i++) {
           for(int j=1;j<=i;j++) {
               System.out.print(ch+ " ");
               ch++;
           }
           System.out.println();
       }
      
   }   
}



  //  OUTPUT:

  //  5
  //  A
  //  B C
  //  D E F
  //  G H I J
 //   K L M N O