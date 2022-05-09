import java.util.*;
import java.io.*;

public class Array9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int srcPos = sc.nextInt();
        int destPos = sc.nextInt();
        int length = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("Enter First Array Elements: ");
        for(int i=0;i<n;i++) {
              arr1[i] = sc.nextInt();
        }
        System.out.println("Enter First Array Elements: ");
        for(int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }

        System.arraycopy(arr1,srcPos,arr2,destPos,length);
        System.out.println("New Array is: ");
        for(int i=0;i<m;i++) {
            System.out.print(arr2[i]+ " ");
        }
        sc.close();
    }
}
