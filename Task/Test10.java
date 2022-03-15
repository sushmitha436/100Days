import java.util.*;
import java.io.*;

public class Test10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int searchElement = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++) {
           if(arr[i]==searchElement){
               count++;
           }
        }
        if(count==0){
            System.out.println("Element is not found");
        } else {
        System.out.println("Count is: " +count);
        }
        sc.close();
    }
}

/*
    OUTPUT:
    5
    1 2 3 3 4 
    3
    Count is: 2
*/