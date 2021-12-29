import java.util.*;

public class Pattern23 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          for(int i=1;i<=n;i++) {
              for(int j=i;j<=n;j++) {
                  System.out.print("  ");
              }
              char ch = 'A';
              for(int j=1;j<i;j++) {
                  System.out.print(ch+ " ");
                  ch++;
              }
              for(int j=1;j<=i;j++) {
                  System.out.print(ch+ " ");
                  ch--;
              }
              System.out.println();
          }
      }    
}

//  OUTPUT:
 
// 5
//            A 
//          A B A
//        A B C B A
//      A B C D C B A
//    A B C D E D C B A 
