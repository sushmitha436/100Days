import java.util.*;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            int temp=1;
            for(int j=i;j<=n;j++) {
                System.out.print("  ");
            }
            for(int j=1;j<i;j++) {
                System.out.print(temp+ " ");
                temp++;
            }
            for(int j=1;j<=i;j++) {
                System.out.print(temp+ " ");
                temp--;
            }
            System.out.println();
        }
    }    
}  

// OUTPUT:

5
          1 
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
