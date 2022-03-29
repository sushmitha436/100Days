import java.util.*;
import java.io.*;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        int number = sc.nextInt();
        float fl = sc.nextFloat();
        sc.nextLine();
        String str = sc.nextLine();
        double db = sc.nextDouble();
        System.out.println("Single Character is: " +ch);
        System.out.println("Integer is: " +number);
        System.out.println("Float Value is: " +fl);
        System.out.println("String is: " +str);
        System.out.println("Double Value is: " +db);
        
    }
}