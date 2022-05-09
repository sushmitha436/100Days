import java.util.*;

public class Array3 {
        static int[] Array() {
            return new int[]{1,2,3,4,5};
        }
        public static void main(String args[]) {
            int arr[] = Array();
            System.out.println("Array is: ");
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i]+ " ");
            }
    }
}