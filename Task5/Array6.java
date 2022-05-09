import java.util.*;

public class Array6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of an Array: ");
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
        System.out.println("Sum is: " +sum);
        double average = sum / 2;
        System.out.println("Average is: " +average);
    }
}