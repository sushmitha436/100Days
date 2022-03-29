import java.util.*;

public class DaysIntoMonths {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.Of Days: ");
        int n = sc.nextInt();
        int months = n/30;
        int days = n%30;
        System.out.println("No.of Months are: " +months);
        System.out.println("No.of Days are: " +days);
    }
}