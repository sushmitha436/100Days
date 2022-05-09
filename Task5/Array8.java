import java.util.*;

public class Array8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Elements of an Array1: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of an Array2: ");
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.compare(arr,arr2)); // It returns 0 if two arrays are lexicographically equal.
    }                                                 // it returns 1 if arr1 is greater than arr2.
                                                      // it returns -1 if arr2 is greater than arr1.
}