import java.util.Scanner;
public class RSAS {
    static int modPow(int base, int exp, int mod) {
        int result = 1;
        base %= mod;
        for (int i = 0; i < exp; i++) {
            result = (result * base) % mod;
        }
        return result;
    }
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {if (n % i == 0) return false;}
        return true;
    }
    static void rsa(int m, int p, int q) {
        int n = p * q, phi = (p - 1) * (q - 1), e = 2, d = 0;
        while (gcd(e, phi) != 1) e++;
        int k = 1;
        while ((k * phi + 1) % e != 0) k++;
        d = (k * phi + 1) / e;
        int cipher = modPow(m, e, n);
        System.out.println("Encrypted: " + cipher);
        System.out.println("Decrypted: " + modPow(cipher, d, n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Message: "); int m = sc.nextInt();
        System.out.print("Prime p: "); int p = sc.nextInt();
        System.out.print("Prime q: "); int q = sc.nextInt();
        if (!isPrime(p) || !isPrime(q)) {
            System.out.println("p and q must be prime");
            return;
        }
        rsa(m, p, q);
        sc.close();
    }
}
