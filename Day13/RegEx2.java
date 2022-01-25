import java.util.*;
import java.util.regex.*;
import java.io.*;

public class RegEx2 {
     public static void main(String[] args) {
         final String REGEX_PATTERN = "!{3}$";
         Pattern r = Pattern.compile(REGEX_PATTERN);
         try {
             FileReader fr = new FileReader("C:\\practiceG\\Sushmitha\\data2.txt");
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
Hello World!!!
Hi All!!!
Hurray!!!
Welcome to java!
This is Sushmitha.
Good Morning!

OUTPUT:
Hello World!!!
Hi All!!!
Hurray!!!

*/