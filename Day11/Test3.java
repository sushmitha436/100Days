import java.util.*;

public class Test3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = { 1,3,5,7};
       int n = sc.nextInt();
       sc.close();

       try{
           System.out.println(arr[n]);
       }
       catch(ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
       } 

       finally{
           System.out.println("Next Statement");
       }
   }    
}
