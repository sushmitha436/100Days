import java.util.*;
import java.io.*;

public class GenerateId {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.nextLine();
        String Lastname = sc.nextLine();
        int Pin = sc.nextInt();
        String pn = Integer.toString(Pin);
        int n = sc.nextInt();
        int b = pn.length();
        int Fl = FirstName.length();
        int Ls = Lastname.length();

        sc.close();
        

        if(Fl >Ls) {
            System.out.println(Lastname.charAt(Ls-1)+FirstName+pn.charAt(n-1)+pn.charAt(b-n));
        } 
        else
          if(Fl < Ls) {
            System.out.println(FirstName.charAt(Fl-1)+Lastname+pn.charAt(n-1)+pn.charAt(b-n));
          }
          else
          {
              for(int i=0;i<Ls; i++) {
                  if(FirstName.charAt(i)==Lastname.charAt(i))
                        continue;
                  else  if(FirstName.charAt(i)<Lastname.charAt(i)){
                          System.out.println(FirstName.charAt(Fl-1)+Lastname+pn.charAt(n-1)+pn.charAt(b-n));
                          break;
                        }

                        else{
                          System.out.println(Lastname.charAt(Ls-1)+FirstName+pn.charAt(n-1)+pn.charAt(b-n));
                          break;
                        }
              }
          }
    }
}