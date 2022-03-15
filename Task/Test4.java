import java.util.*;
import java.io.*;

public class Test4 {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    int result =1;
    
    System.out.println("Enter the Array Elements: ");
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println("Array is: ");

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(i==j || i==1 || j==n) {
             result += arr[i][j];
            }
        }
    }
    System.out.println("Sum Of Upper Triangle is: " +result);

    sc.close();
    }
}

/* 
    OUTPUT:
    3
    Enter the Array Elements: 
    1 2 3 4 5 6 7 8 9
    Array is: 
    1 2 3 
    4 5 6
    7 8 9
    Sum Of Upper Triangle is: 26
*/
