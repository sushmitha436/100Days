import java.util.*;

public class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversedNumber = 0;
        int remainder = 0;
        sc.close();

        while(num!=0) {
            remainder = num%10;
            reversedNumber = reversedNumber*10+remainder;
            num = num/10;

        }

        System.out.println("Reversed Number: " +reversedNumber);
    }
}

/*
    OUTPUT:
    1234
    Reversed Number: 4321
*/