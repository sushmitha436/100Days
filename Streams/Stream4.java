import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Stream4 {
    public static void main(String args[]) {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(9);
        ar.add(10);
        ar.add(6);
        ar.add(8);
        ar.add(11);
        ar.add(5);
        
        List<Integer> updatedList = ar.stream().filter(e -> (e%2==0)).collect(Collectors.toList());
        System.out.println(updatedList);
    }
}