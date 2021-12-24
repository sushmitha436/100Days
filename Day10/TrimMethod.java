import java.util.*;

public class TrimMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str); // if a string contains additional spaces before and after,it prits same how we give input.
        String str2 = str.trim(); // if a string contain any additional spaces before and after,it removes the unneccesary spaces and print the string. 
        System.out.println(str2); 
    }    
}
