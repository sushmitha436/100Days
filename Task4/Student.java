import java.util.*;
import java.io.*;

public class Student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Marks:");
        int marks = sc.nextInt();

        if(marks>=35 && marks<50) {
            System.out.println("Student grade is C");
        }
        else if(marks>50 && marks<75) {
            System.out.println("Student grade is B");
        }
        else if(marks>75 && marks<90) {
            System.out.println("Student grade is A");
        }
        else if(marks>90 && marks<=100) {
            System.out.println("Student grade is A+");
        }else {
            System.out.println("Student is fail");
        }
    }
}