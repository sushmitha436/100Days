import java.util.*;

public class Pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int temp=0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                temp++;
                System.out.print(temp+ " ");
            }
            System.out.println();
        }
    }
}

/*
    OUTPUT:
    4
    1 
    2 3
    4 5 6
    7 8 9 10
*/