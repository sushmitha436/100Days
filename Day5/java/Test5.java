import java.util.*;

public class Test5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        int sum = 0;
        int sum2 = 0;
        System.out.println("Elements of an Array1: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of an Array2: ");
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
        for(int i=0;i<n;i++) {
            sum2 += arr2[i];
        }
        int result = sum+sum2;
        System.out.println("Sum of two array elements is: " +result);
    }
}

OUTPUT:
5
Elements of an Array1:
1 2 3 4 5
Elements of an Array2:
6 7 8 9 10
Sum of two array elements is: 55