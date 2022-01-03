import java.util.*;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();
        String S3 = sc.nextLine();
        String S4 = S1.concat(" ").concat(S2).concat(" ").concat(S3);   //It combines Strings S1,S2,S3
        System.out.println(S4);
        String S5 = sc.nextLine();
       // String S6 = sc.nextLine();
        if(S4.contains(S5)) {             // To check whether the string S4 contains String S5 or not
            System.out.println("java is an Object Oriented Programming Language");
        }else {
            System.out.println("Match not found");
        }
        System.out.println(S4.endsWith(S5));   // To check whether the String S4 ends with  String S5 or not 
                                               // if it ends with S5 it returns true.Other wise it returns false
        sc.close();
    }
}
