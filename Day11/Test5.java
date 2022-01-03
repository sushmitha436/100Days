import java.util.*;

public class Test5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       sc.close();

       try{
            int num = Integer.parseInt(str);
            System.out.println(num);
       }

       catch(NumberFormatException e) {
           System.out.println(e);
       }
       finally {
           System.out.println("Next Statement...!");
       }
    }
    
}
