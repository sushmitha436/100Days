import java.util.*;

public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String number = Integer.toString(num);
        int len = number.length();
        int result = 0,remainder;
        int temp = num;

        while(temp != 0) {  
            remainder = temp%10;
            result += Math.pow(remainder,len);
            temp /= 10;      
        }
        if(result==num) {
                 System.out.println(number+ " is an Armstrong number");
             }else {
                 System.out.println(number+ " is not an Armstrong number");
             }
    }
}