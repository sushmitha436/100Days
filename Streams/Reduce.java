import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Reduce {
    public static void main(String args[]) {
        ArrayList<String> ar = new ArrayList<String>();

        ar.add("Welcome");
        ar.add("To");
        ar.add("Java");
        ar.add("World");
        
        Optional<String> reduced = ar.stream().reduce((e1,e2) -> e1 + " " + e2);
        System.out.println(reduced.get());
    }
}