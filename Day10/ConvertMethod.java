import java.util.*;

public class ConvertMethod {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
     String S1 = sc.nextLine();
     String S2 = sc.nextLine();
     System.out.print(S1.substring(0,1).toUpperCase()+S1.substring(1).toLowerCase()+" "); // it converts the first letter of string S1 into uppercase and remaining letters into lowercase.
     System.out.print(S2.substring(0,1).toUpperCase()+S2.substring(1).toLowerCase());   // it converts the first letter of string S2 into uppercase and remaining letters into lowercase.
     
     sc.close();
   }
}
