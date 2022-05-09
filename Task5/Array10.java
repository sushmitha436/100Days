import java.util.*;

public class Array10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[m];
        System.out.println("Elements of an Array1: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of an Array2: ");
        for(int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }
        int[] result =new int[n+m];
        System.arraycopy(arr,0,result,0,n); 
        System.arraycopy(arr2,0,result,n,m); 
        System.out.print((Arrays.toString(result))+ " ");
        sc.close();
    }
}                                                 
                                                      