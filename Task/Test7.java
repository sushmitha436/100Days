import java.util.*;
import java.io.*;

public class Test7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            if(arr[i]%3==0){
                System.out.print("Fizz" +" ");
            } else if(arr[i]%5==0){
                System.out.print("Buzz"+" ");
            }else if((arr[i]%3)==0&&(arr[i]%5==0)) {
                System.out.print("FizzBuzz"+" ");
            }
            else{
                System.out.print(arr[i]+ " ");
            }
        }
        sc.close();
    }
}

/*
    OUTPUT:
    5
    1 2 3 4 5
    1 2 Fizz 4 Buzz 
*/