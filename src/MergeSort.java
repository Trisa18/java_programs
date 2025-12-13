import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1,7,3,8,6,4,9,0};
        int[] sorted = mergesorting(a);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] mergesorting(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesorting(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesorting(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }

        while (i < first.length) {
            mix[k++] = first[i++];
        }

        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }
}
