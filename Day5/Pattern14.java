import java.util.*;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            char ch = 'E';
            for(int j= 1;j<=i;j++) {
                System.out.print(ch+ " ");
                ch--;
            }
            System.out.println();
        }
    }    
}




  //  OUTPUT:
     
  //  5
  //  E
  //  E D
  //  E D C
  //  E D C B
  //  E D C B A
