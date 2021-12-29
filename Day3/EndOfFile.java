import java.util.*;
import java.io.*;

public class EndOfFile {
    public static void main(String[] args) {
       String S = "Hello World\nI am a file\nRead me until end-of-file";
        Scanner scan = new Scanner(S);
        for(int i=1;scan.hasNext();i++) {
            System.out.println(i+ "  "+scan.nextLine());
        }
        scan.close();
    }    
}
