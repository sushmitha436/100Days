import java.util.*;
import java.io.*;

public class EvenNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Even Numbers Are: ");
        for(int i=1;i<=n;i++) {
            if(i%2==0) {
                System.out.print(i+ " ");
            }
        }
    }
}