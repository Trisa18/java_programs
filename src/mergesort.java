import java.util.Scanner;
public class mergesort {
    static int[] a;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        // Initialize the array
        a = new int[n];

        // Take input for the array elements
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        long startTime = System.nanoTime();
        // Call the merge sort algorithm
        mergeSort(0, n - 1);
        long endTime = System.nanoTime();
        // Display the sorted array
        System.out.println("Sorted Array (Merge Sort):");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        long duration = endTime - startTime;
        System.out.println("Time taken for sorting (in nanoseconds): " + duration);

        input.close();
    }

    // Merge Sort function
    public static void mergeSort(int low, int high) {
        if (low < high) {
            // Find the middle point
            int mid = (low + high) / 2;

            // Recursively sort the left and right halves
            mergeSort(low, mid);
            mergeSort(mid + 1, high);

            // Merge the sorted halves
            merge(low, mid, high);
        }
    }

    // Merge function to combine two sorted halves
    public static void merge(int low, int mid, int high) {
        int[] b = new int[a.length];
        int i = low, j = mid + 1, k = low;

        // Merge the two halves into the temporary array b
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }

        // If there are remaining elements in the left half
        while (i <= mid) {
            b[k++] = a[i++];
        }

        // If there are remaining elements in the right half
        while (j <= high) {
            b[k++] = a[j++];
        }

        // Copy the merged array back into the original array a
        for (i = low; i <= high; i++) {
            a[i] = b[i];
        }
    }
}


