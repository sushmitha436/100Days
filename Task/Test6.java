import java.util.*;
import java.io.*;

public class Test6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr[i]+arr[j]==sum) {
                    count++;
                }
            }
        }
        System.out.println("Pair of elements whose sum is equal to given sum: " +count);
    }
}