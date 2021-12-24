import java.util.*;

public class JoinMethod {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String S1 = sc.nextLine();
            String S2 = sc.nextLine();
            String S3 = sc.nextLine();
            String str = String.join("-",S1,S2,S3);
            String str2 = String.join(":",S1,S2,S3);
            System.out.println(str);  //it joins the "-" symbol between S1 and S2,S2 and S3
            System.out.println(str2);  //it joins the ":" symbol between S1 and S2,S2 and S3
            System.out.println(str.lastIndexOf('-'));  //it returns the last index of '-' in the string
            System.out.println(str.lastIndexOf('-',5));  // it returns -1 if '-' not present in given index range.otherwise it returns index.
                                                         // lastIndexOf() method works for substring also.

      }  
}
