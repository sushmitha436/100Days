import java.util.*;
import java.io.*;

public class Circle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int radius = sc.nextInt();

        double result = (22.7*(Math.pow(radius,2)));
        System.out.println("Area of Circle is: " +result);
    }
}