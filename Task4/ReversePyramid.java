import java.util.*;
import java.io.*;

public class ReversePyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int k=i;k<n;k++) {
                System.out.print("*");
            }
            for(int k=i;k<=n;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}