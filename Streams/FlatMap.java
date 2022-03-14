import java.util.*;
import java.io.*;
import java.util.stream.*;

public class FlatMap {
    public static void main(String args[]) {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Welcome To Java World");
        ar.add("Java is an High-level Programming Language");
        ar.add("It is very easy to learn");

        ar.stream().flatMap(e -> Stream.of(e)).forEach(System.out::println);
            }
    }
