import java.util.*;
import java.io.*;

public class Recursion {
    static int factorial(int n) {
        if(n==0) 
        return 1;
        else 
        return(n*factorial(n-1));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i,result=1;
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        result = factorial(number);
        System.out.println("Factorial of a given number is: " +result);
    }
}