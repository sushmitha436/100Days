import java.util.*;
import java.io.*;

public class Float {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();

        System.out.println("Smaller integer of " +number+ " is " +Math.ceil(number));
        System.out.println(+number);
        System.out.println("Larger integer of " +number+ " is " +Math.floor(number));
    }
}