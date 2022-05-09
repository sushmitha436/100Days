import java.util.*;
import java.io.*;

public class Test2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		sc.close();

		switch(number) {
			case 1: System.out.println("Colour is Violet");
			break;
			case 2: System.out.println("Colour is Indigo");
			break;
			case 3: System.out.println("Colour is Blue");
			break;
			case 4: System.out.println("Colour is Green");
			break;
			case 5: System.out.println("Colour is Yellow");
			break;
			case 6: System.out.println("Colour is Orange");
			break;
			case 7: System.out.println("Colour is Red");
			break;
			case 8: System.out.println("Colour is Black");
			break;
			case 9: System.out.println("Colour is White");
			break;
		}
	}
}

OUTPUT:
Enter a number:
8
Colour is Black