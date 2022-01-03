import java.util.*;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<=str.length()-1;i++) {
            if(i%2==0) {
                System.out.println("Character at " + i+" place is " + str.charAt(i) );
            }
        }

        sc.close();

    }
}