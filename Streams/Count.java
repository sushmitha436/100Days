import java.util.*;
import java.io.*;

public class Count {
    
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);
        ar.add(9);

       long rs = ar.stream().filter(e -> (e%2==0)).count();
       boolean result = ar.stream().noneMatch(e -> (e%2==0));
       System.out.println(result);
       System.out.println(rs);

       // ar.stream().map(e -> e.toUpperCase()).map(e -> e.substring(0,3)).filter(e -> e.startsWith("W")).forEach(System.out::println);
      // ar.stream().limit(4).forEach(System.out::println);
      //ar.stream().map(Stream2::multiplyByFive).map(Stream2::addTen).forEach(System.out::println);
    }
}