import java.util.*;

public class InternMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        String S3 = S1.intern();
        System.out.println(S1==S2); // it returns false even though content is same.why because refernce variables are pointing towards different objects.
        System.out.println(S1==S3);  // it returns true ,why because refernce variables are pointing towards same objects.
    
        sc.close();
    }
}