import java.util.*;
import java.io.*;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4==0) {
            System.out.println(year+" is a Leap Year ");
        }else {
            System.out.println(year+" is not a Leap Year ");
        }
    }
}