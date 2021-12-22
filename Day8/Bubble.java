import java.util.*;
import java.io.*;

class Bubble {
    static void bubblesort(int array[]) {
        int size = array.length;
        for(int i=0;i<(size-1);i++) {
            for(int j=0;j<(size-i-1);j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int data[] = {1, 33,2,89,4,56,44,9,23,99};
        Bubble.bubblesort(data);
        System.out.println("sorted Elements: ");
        System.out.println(Arrays.toString(data));
    }
  
 }


