import java.util.*;

public class Power {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        int result = 1;
        sc.close();

        for(int i=1;i<=power;i++) {
            result *= 2;
        }
        System.out.println("Power is: " +result);
    }
}