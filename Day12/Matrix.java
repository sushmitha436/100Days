import java.util.*;

public class Matrix {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[][] = new int[n][n];
         for(int i=0;i<n;i++) {
             for(int j=0;j<n;j++) {
                 arr[i][j] = sc.nextInt();
             }
         }
         int first=0,second=0;
         for(int i=0;i<n;i++) {
             for(int j=0;j<n;j++) {
                 if(j==i) 
                     first=first+arr[i][j];
             }
                
             }
             for(int i=0;i<n;i++) {
                 for(int j=0;j<n;j++) {
                     if(i==n-j-1) {
                         second=second+arr[i][j];
                     }
                 }

             }
             int diff = second - first;
             diff = Math.abs(diff);
             System.out.println(diff);
             sc.close();
         }
     }    

