import java.util.*;
import java.io.*;

public class Month {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        String monthName = "";
        int days = 0;
        sc.close();

        if(month==1) {
            monthName = "January";
            days = 31;
        }
       else if(month==2) {
            monthName = "Febraury";
            if((year%4==0))
                days = 29;
            else
                 days = 28;
        }
       else if(month==3) {
            monthName = "March";
            days = 31;
        }
       else if(month==4) {
            monthName = "April";
            days = 30;
        }
       else if(month==5) {
            monthName = "May";
            days = 31;
        }
       else if(month==6) {
            monthName = "June";
            days = 30;
        }
        else if(month==7) {
            monthName = "July";
            days = 31;
        }
       else if(month==8) {
            monthName = "August";
            days = 31;
        }
        else if(month==9) {
            monthName = "September";
            days = 30;
        }
        else if(month==10) {
            monthName = "October";
            days = 31;
        }
        else if(month==11) {
            monthName = "November";
            days = 30;
        }
        else if(month==12) {
            monthName = "December";
            days = 31;
        } 
        
        System.out.println(monthName+" "+year+" has "+days+" days");

    }
}

/*
    OUTPUT:
    2
    2016
    Febraury 2016 has 29 days
*/