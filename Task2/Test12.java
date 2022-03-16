import java.util.*;
import java.io.*;

public class Test12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        for(char i : str.toCharArray()) {
            if(str.indexOf(i)==str.lastIndexOf(i)) {
                System.out.println("First non-repeated character is: " +i);
                break;
            }
        }
    }
}

/*
    OUTPUT:
    apple
    First non-repeated character is: a
*/