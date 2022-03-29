import java.util.*;
import java.io.*;

public class SumAndProduct {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num = sc.nextInt();
        int temp = num;
        int sum=0,product=1;
        int result=0;
        
        while(temp!=0){
            result = temp%10;
            sum += result;
            product *= result;
            temp /= 10;
        }
        System.out.println("Sum is: " +sum);
        System.out.println("Product is: " +product);
    }
}
