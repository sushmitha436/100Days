import java.util.*;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
             int temp =n;
            for(int j=1;j<=i;j++) {
                System.out.print(temp+ " ");
                temp--;
            }
            System.out.println();
        }
    }    
}


//  OUTPUT:

5
5 
5 4
5 4 3 
5 4 3 2
5 4 3 2 1