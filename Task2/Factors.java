import java.util.*;
import java.io.*;

public class Factors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Factors Are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

/*
    OUTPUT:
    6
    Factors Are: 
    1 2 3 6 
*/