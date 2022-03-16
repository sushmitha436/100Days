class Bubble {
   void bubblesort(int arr[]) {
       int n = arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<(n-i-1);j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Bubble bs = new Bubble();
        int arr[] = {1,34,22,67,45,36,78,90,56,2};
        bs.bubblesort(arr);
        System.out.println("Sorted Elements: ");
        bs.printArray(arr);
    }
}

/*
    OUTPUT:
    Sorted Elements: 
    1 2 22 34 36 45 56 67 78 90 
*/