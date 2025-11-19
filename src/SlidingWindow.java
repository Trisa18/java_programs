import java.util.Scanner;
public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter window size: ");
        int wsize = sc.nextInt();
        System.out.print("Enter total number of frames: ");
        int totalFrames = sc.nextInt();
        int sentFrame = 1; // first frame to send
        while (sentFrame <= totalFrames) {
            int c = 0;
            System.out.println("Sending frames:");
            for (int i = sentFrame; i < sentFrame + wsize && i <= totalFrames; i++) {
                System.out.println("Frame " + i + " sent");
                c++;
            }

            System.out.print("Enter last frame acknowledged: ");
            int ackFrame = sc.nextInt();

            if (ackFrame >= sentFrame && ackFrame < sentFrame + c) {
                sentFrame = ackFrame + 1; // move window
            } else {
                System.out.println("Invalid acknowledgment. Resending from frame " + sentFrame);
            }
        }
        System.out.println("All frames sent successfully.");
        sc.close();
    }
}
