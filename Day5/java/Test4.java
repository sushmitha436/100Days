import java.util.*;
import java.io.*;

public class Test4 {
	static int find(int n) {
		if(n<=6)
		return n;
		int number = 0;
		int current = 0;
		for(int i=n-3;i>=1;i--) {
		    current = (n-i-1)*find(i);
		    if(current>number)
			number = current;
		}
		return number;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("No.of A's With "+n+ " is " +find(n));
		sc.close();
	}
}	 


OUTPUT:
Enter a number:
7
No.of A's With 7 is 9   