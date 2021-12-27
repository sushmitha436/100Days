import java.util.*;
import java.io.*;

public class Pattern1 {
    public static void main(String[] args) {
       Scanner A = new Scanner(System.in); 
        int n = A.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

// OUTPUT:

  5
  * 
  * * 
  * * * 
  * * * * 
  * * * * * 
