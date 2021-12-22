import java.util.*;
import java.io.*;
 
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a==0){
        System.out.println("Not A Prime Number");
        }
     else{
        int flag=0;
        for(int i=2;i<a;i++) {
            if(a%i == 0) {
                flag++;
            }
        }
        if(flag==1)
        System.out.println("Prime Number");
        else
        System.out.println("Not a Prime Number");
    }
}
        

}
