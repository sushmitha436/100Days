import java.util.*;
import java.io.*;

public class Test1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial of a given number: " +fact);
		sc.close();
	}
}
	




OUTPUT:
Enter a number:
5
Factorial of a given number: 120		