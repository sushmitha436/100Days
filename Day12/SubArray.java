import java.util.*;

public class SubArray {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
          int[] arr = new int[n];
          for(int i=0;i<n;i++) {
              arr[i] = sc.nextInt();
          }
          int subarray=0;
          for(int i=0;i<n;i++) {
              int sum=arr[i];
              if(sum<0) 
                  subarray++;
                  for(int j=i+1;j<n;j++) {
                    sum+=arr[j];
                    if(sum<0) 
                        subarray++;
              }    
                  }
          System.out.println(subarray);
          sc.close();
    }
}