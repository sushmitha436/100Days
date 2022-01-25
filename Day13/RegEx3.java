import java.util.*;
import java.util.regex.*;
import java.io.*;

public class RegEx3 {
     public static void main(String[] args) {
         final String REGEX_PATTERN = "e*[(tha)(sha)]$";
         Pattern r = Pattern.compile(REGEX_PATTERN);
         try {
             FileReader fr = new FileReader("C:\\practiceG\\Sushmitha\\data3.txt");
             BufferedReader br = new BufferedReader(fr);
             
             String line;

             while((line = br.readLine()) != null) {
                 Matcher m = r.matcher(line);
                 if(m.find()) {
                     System.out.println(line);
                 }
             }
             br.close();
         } catch(IOException e) {
             System.out.println(e);
         }
     }    
}

/*

DATA:
seetha
geetha
bindu
manasa
praneetha
sushmitha
maneesha
ayesha

OUTPUT:
seetha
geetha   
praneetha
sushmitha
maneesha 
ayesha   

*/
