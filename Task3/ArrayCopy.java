import java.util.*;
import java.io.*;

public class ArrayCopy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int srcPos = sc.nextInt();
        int destPos = sc.nextInt();
        int length = sc.nextInt();
        String arr1[] = new String[n];
        String arr2[] = new String[m];

        for(int i=0;i<n;i++) {
              arr1[i] = sc.next();
        }
        for(int i=0;i<m;i++) {
            arr2[i] = sc.next();
        }

        System.arraycopy(arr1,srcPos,arr2,destPos,length);
        System.out.println("New Array is: ");
        for(int i=0;i<m;i++) {
            System.out.print(arr2[i]+ " ");
        }
    }
}

/*
    OUTPUT:
    9
    18
    2
    2
    4
    s u m a l a t h a
    s u s h m i t h a g a n g a r a p u
    New Array is: 
    s u m a l a t h a g a n g a r a p u
*/