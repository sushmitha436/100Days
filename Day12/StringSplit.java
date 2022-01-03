import java.lang.ref.Cleaner;
import java.util.*;

public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = "[  :,'&%$#?@!_-]";
        String[] Str = S1.split(S2);
        sc.close();

        for(String t : Str) {
            System.out.println(t);
        }
        System.out.println(Str.length);

    }

}
/*

  OUTPUT:

  He is a very good boy,isn't he?
He  
is  
a   
very
good
boy 
isn 
t   
he  
9  
 
*/