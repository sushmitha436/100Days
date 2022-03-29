import java.util.*;

public class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limits:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;

        for(int i=m;i<n;i++) {
            if(i%7==0) {
                sum +=i;
            }
        }
        System.out.println("Sum is: " +sum);
    }
}