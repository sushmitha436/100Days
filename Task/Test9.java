import java.util.*;
import java.io.*;

public class Test9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        
        System.out.println("Elements of First Array: ");
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Elements of Second Array: ");
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.println("Common Elements Are: " +arr1[i]);
                }
            }
        }
        sc.close();
    }
}

/*
    OUTPUT:
    5
    Elements of First Array: 
    1 2 3 4 5
    Elements of Second Array: 
    2 6 7 8 9
    Common Elements Are: 2
*/