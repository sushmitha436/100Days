import java.util.*;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<n;i++) {
            char ch = 'A';
            for(int j=1;j<=i;j++) {
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            char ch = 'A';
            for(int j=i;j<=n;j++) {
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
//  A B
//  A B C
//  A B C D
//  A B C D E
//  A B C D
//  A B C
//  A B
//  A
