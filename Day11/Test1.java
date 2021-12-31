import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        try {
            int result = A/B;
            System.out.println(result);
        }

        catch(ArithmeticException e) {
            System.out.println(e);
        }
        

    }    
}
