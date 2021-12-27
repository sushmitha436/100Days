import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            char ch = 'E';
            for(int j=n;j>=i;j--){
                System.out.print(ch+ "  ");
                ch--;
            }
            System.out.println();
        }
    }
    
}

//  OUTPUT:

//  5
//  E  D  C  B  A  
//  E  D  C  B
//  E  D  C
//  E  D
//  E
