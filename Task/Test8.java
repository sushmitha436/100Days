import java.util.*;
import java.io.*;

public class Test8 {
    public static int secLar(int[] arr,int total) {
        Arrays.sort(arr);
        return arr[total-2];
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        int temp = Test8.secLar(arr,n);
        System.out.println("Second Largest Element is: " +temp);
        sc.close();

    }
}

/*
    OUTPUT:
    5
    1 2 3 4 5
    Second Largest Element is: 4
*/