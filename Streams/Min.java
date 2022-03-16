import java.util.*;

public class Min {
    public static void main(String args[]) {
        ArrayList<Integer> ar = new ArrayList<Integer>();

        ar.add(2);
        ar.add(27);
        ar.add(1);
        ar.add(43);
        ar.add(75);

       Optional<Integer> min = ar.stream().min((e1,e2) -> e1.compareTo(e2));
       Integer minimum = min.get();
       System.out.println(minimum);
        
    }
}
