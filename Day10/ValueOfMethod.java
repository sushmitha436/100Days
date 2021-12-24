import java.util.*;

public class ValueOfMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        float f = sc.nextFloat();
        String S1 = String.valueOf(n);  // it converts integer to string
        String S2 = String.valueOf(d);  // it converts double to string
        String S3 = String.valueOf(f);  // it converts float to string
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
    }    
}
