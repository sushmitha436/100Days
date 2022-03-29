import java.util.*;
import java.io.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=1;

        System.out.println("Factorial of a given number: ");
        for(int i=1;i<=n;i++) {
            temp *=i;
        }
        System.out.println(temp);
    }
}