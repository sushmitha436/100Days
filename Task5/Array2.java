import java.util.*;

public class Array2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of an Array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}