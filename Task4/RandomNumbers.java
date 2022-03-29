import java.util.*;

public class RandomNumbers {
    public static void main(String args[]) {
    Random R = new Random();
    int number = 5;
    while(number>0) {
        int temp = R.nextInt();
        if(temp>1 && temp<100) {
            System.out.println(+temp);
            number--;
            }
    }
    }
}