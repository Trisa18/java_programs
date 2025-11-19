import java.util.Scanner;

public class LeakyBucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of packets: ");
        int n = sc.nextInt();
        int[] pkt = new int[n];
        System.out.println("Enter the packets:");
        for (int i = 0; i < n; i++) pkt[i] = sc.nextInt();

        int rem = 0, cap = 4, rate = 3;
        System.out.println("Clock\tPacket\tAccept\tSent\tRemaining");

        for (int i = 0; i < n; i++) {
            int recv = (rem + pkt[i] > cap) ? -1 : pkt[i];
            if (recv != -1) rem += recv;

            int sent = (rem == 0) ? 0 : Math.min(rem, rate);
            rem -= sent;

            if (recv == -1)
                System.out.printf("%d\t%d\tDropped\t%d\t%d%n", i + 1, pkt[i], sent, rem);
            else
                System.out.printf("%d\t%d\t%d\t%d\t%d%n", i + 1, pkt[i], recv, sent, rem);
        }
        sc.close();
    }
}

