  import java.util.*;
  import java.io.*;
  
  public class Strings {
  
      public static void main(String[] args) {
     
           Scanner sc = new Scanner(System.in);
           String X=sc.next();
           String Y=sc.next();
           String Z=X+Y;
           System.out.println(Z.length());
            if(X.compareTo(Y)>0){
            System.out.println("yes"); 
            }
            else {
              System.out.println("No");
            }         
         System.out.print(X.substring(0,1).toUpperCase()+X.substring(1).toLowerCase()+" ");
         System.out.print(Y.substring(0,1).toUpperCase()+Y.substring(1).toLowerCase());
         

     }         


  }
  