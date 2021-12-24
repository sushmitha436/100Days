import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String[] data = S1.split("\\s"); // it takes space as delimiter and splits the string.
        for(String A : data) {
            System.out.println(A);
        }                                            
        int n = sc.nextInt(); 
        String[] words = S1.split("\\s",n);  // it takes space as delimiter and it splits the given string into n parts. 
        for(String B : words) {
            System.out.println(B);
    }    
}
}
