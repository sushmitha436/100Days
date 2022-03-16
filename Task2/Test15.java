import java.util.*;
import java.io.*;

public class Test15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String str2 = str.replaceAll("[!,@,#,$,%,^,&,*,_,-,.,+,:,;,<,>,?,/,,(),'']","");
        System.out.println("String without Special Characters: " +str2);

    }
}

/*
    OUTPUT:
    Sushm!th@
    String without Special Characters: Sushmth
*/