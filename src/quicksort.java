import java.util.Scanner;
public class quicksort {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();

        System.out.println("Input Array:");
        printArray(a);
        long startTime = System.nanoTime();

        quickSort(a, 0, n - 1);
        long endTime = System.nanoTime();

        System.out.println("Sorted Array:");
        printArray(a);
        long duration = endTime - startTime;
        System.out.println("Time taken for sorting (in nanoseconds): " + duration);


        input.close();
    }

    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }

    static int partition(int[] a, int low, int high) {
        int pivot = a[low], i = low, j = high;
        while (i < j) {
            while (i < high && a[i] <= pivot) i++;
            while (a[j] > pivot) j--;
            if (i < j) swap(a, i, j);
        }
        swap(a, low, j);
        return j;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int[] a) {
        for (int num : a) System.out.print(num + " ");
        System.out.println();
    }
}

