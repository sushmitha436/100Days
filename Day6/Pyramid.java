import java.util.*;

public class Pyramid {
    public static void print(int n) {
        int temp=0;
        for(int i=1;i<=n;i++) {
            for(int j=i;j<n;j++) 
                System.out.print("  ");
                for(int k=1;k<=i;k++) {
                    temp++;
                    System.out.print(temp+" ");
                }
                for(int a=1;a<i;a++) {
                    temp--;
                    System.out.print(temp+" ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}

/*
 OUTTPUT:

 5
        1 
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

*/
