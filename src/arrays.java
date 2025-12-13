import java.util.Arrays;
public class arrrays{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        moveZeros(arr);

        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }

    static void moveZeros(int[] arr) {
        int index = 0;

        // Move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill the rest with zeros
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
