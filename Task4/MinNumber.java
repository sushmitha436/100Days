import java.util.*;
import java.io.*;

public class MinNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = Math.min(m,n);
        System.out.println("Minimum Number is: " +result);
    }
}