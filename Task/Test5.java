import java.util.*;
import java.io.*;

public class Test5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum =0;
        int product =1;

        System.out.println("Enter the array elements: ");

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of Array : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
            sum += arr[i];
            product =arr[i]*product;
        }
        System.out.println("\nSum of Array Elements: " +sum);
        System.out.println("Product of Array Elements: " +product);

        if(sum%2==0) {
            System.out.println("Sum is : " +sum);
        }
        else {
            System.out.println("product is : " +product);
        }
      sc.close();
    }
}

/*
    OUTPUT:
    5
    Enter the array elements: 
    1 2 3 4 5
    Elements of Array : 
    1 2 3 4 5 
    Sum of Array Elements: 15
    Product of Array Elements: 120
    product is : 120
*/