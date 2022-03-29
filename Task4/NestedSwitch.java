import java.util.*;

public class NestedSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int marks = sc.nextInt();

        switch(year) {
            case 1:System.out.println("First year students are not eligible for scholarship");
            break;
            case 2:System.out.println("Second year students are not eligible for scholarship");
            break;
            case 3:{
                switch(marks) {
                    case 35:System.out.println("First year students are not eligible for scholarship");
                    break;
                    case 75:System.out.println("these students are eligible for scholarships");
                    break;
                }
            }
            break;
            default:System.out.println("Invalid entry");
        }
    }
}
