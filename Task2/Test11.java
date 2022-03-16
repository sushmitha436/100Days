import java.util.*;
import java.io.*;

public class Test11 {
    public static void main(String args[]) {
        int count = 0;
        int temp = 0;

        for(char ch='A';ch<='Z';ch++) {
            if(ch=='A'||ch=='B'||ch=='I'||ch=='O'||ch=='U') {
                count++;
            } else {
                temp++;
            }
        }
        System.out.println("Number of Vowels: " +count);
        System.out.println("Number of constants: " +temp);
    }
}

/*
    OUTPUT:
    Number of Vowels: 5
    Number of constants: 21
*/