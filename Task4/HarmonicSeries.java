import java.util.*;

public class HarmonicSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = 0.0;
        System.out.println("Harmonic Series is:");
        while(n>0) {
            result = result + (double)1/n;
            n--;
            System.out.println(+result);
        }
    }
}