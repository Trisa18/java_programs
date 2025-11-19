import java.util.*;
public class Crc {
    static final int[] GP = {1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1}; // x^16 + x^15 + x^5 + 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Data Frame: ");
        int len = sc.nextInt();
        int[] msg = new int[len + 16];
        System.out.print("Enter Message: ");
        for (int i = 0; i < len; i++) msg[i] = sc.nextInt();
        int[] original = msg.clone();
        divide(msg, len);
        // XOR remainder with original -> transmitted data
        for (int i = 0; i < msg.length; i++) msg[i] ^= original[i];
        System.out.println("Data to be transmitted: " + Arrays.toString(msg));
        System.out.print("Enter Received Data: ");
        for (int i = 0; i < msg.length; i++) msg[i] = sc.nextInt();
        divide(msg, len);
        System.out.println(Arrays.stream(msg).anyMatch(x -> x != 0) ? "Error in data" : "No error");
    }

    static void divide(int[] a, int k) {
        for (int i = 0; i < k; i++)
            if (a[i] == 1)
                for (int j = 0; j < GP.length; j++)
                    a[i + j] ^= GP[j];
    }
}
