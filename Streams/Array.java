import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Array {
    public static void main(String args[]) {
        ArrayList<String> ar = new ArrayList<String>();

        ar.add("34");
        ar.add("4");
        ar.add("3");
        ar.add("44");
        ar.add("55");
        ar.add("7");
        ar.add("1");

        Stream<String> stream = ar.stream();

        Object[] objects = stream.toArray();

        System.out.println(objects);
        
        

    }
}