import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        String A1,reverse="";
        
        Scanner sc = new Scanner(System.in);
        A1 = sc.nextLine();
        int length = A1.length();
       
        for(int i =length-1;i>=0;i--) 
            reverse = reverse+A1.charAt(i);
            if(A1.equals(reverse)) 
            System.out.println("Yes");
            else
            System.out.println("No");
           

        }
        
        
       
    }
