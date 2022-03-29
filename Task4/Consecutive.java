import java.util.*;
import java.io.*;

public class Consecutive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res1=0,res2=0;
        int temp1=0,temp2=0;
        int count1=0,count2=0;

        for(int i=1;i<=n;i++) {
            if(i%2==0) {
                temp1 += i;
                count1++;
                res1 = temp1/count1;
            }else {
                temp2 += i;
                count2++;
                res2 = temp2/count2;
            }
        }
        System.out.println("Average of Consecutive N even Numbers: " +res1);
        System.out.println("Average of Consecutive N odd Numbers: " +res2);
        sc.close();
    }
}