import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String number = Integer.toString(num);
        sc.close();
        String reversedString = (new StringBuffer(number)).reverse().toString();
        if(number.equals(reversedString)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}