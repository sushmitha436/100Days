import java.util.*;
import java.io.*;

public class Test3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min,max;

        System.out.println("Enter Array Elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for(int i =0;i<n;i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("smallest element is: " +min);
        System.out.println("largest element is: " +max);

        sc.close();
    }
}


/*
    OUTPUT:
    5
    Enter Array Elements: 
    2 33 3 89 22
    smallest element is: 2
    largest element is: 89
*/