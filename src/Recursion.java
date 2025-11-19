public class Recursion {
    public static void main(String[] args) {
        num_till_1(5);
        num1ton(5);

        System.out.println(fact(5));
        System.out.println(sum(5));
        System.out.println(sumofdigits(1342));
        System.out.println(prodofdigits(1342));
        System.out.println(reverse(1345));
        System.out.println(countdigits(12347767));
        System.out.println(ispalindrome(121));
        System.out.println(countzeros(40800));
        System.out.println(stepcount(8,0));

    }


    static void num_till_1(int num) {
        if (num == 0) return;
        System.out.println(num);
        num_till_1(num - 1);
    }

    static void num1ton(int num) {
        if (num == 0)
            return;
        num1ton(num - 1);
        System.out.println(num);


    }

    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);

    }


    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    static int sumofdigits(int n) {
        if (n == 0) return 0;

        int rem = n % 10;
        return rem + sumofdigits(n / 10);
    }

    static int prodofdigits(int n){
        if (n%10==n) return n;

        int rem = n % 10;
        return rem * prodofdigits(n / 10);
    }
    static int sum=0;
    static int reverse(int n){

        if (n==0) return sum;
        int rem=n%10;
        sum= sum*10+rem;
        return reverse(n/10);

    }
    static int count=0;
    static int countdigits(int n){
        if(n==0) return count;
        int rem=n%10;
        count+=1;
        return countdigits(n/10);

    }

    static boolean ispalindrome(int n){
        sum = 0;
        int rev=reverse(n);
        if (n==rev)
            return true;
        else
            return false;

        }
    static int c=0;
    static int countzeros(int n){
        if(n==0) return c;
        int rem=n%10;
        if(rem==0) c+=1;
        return countzeros(n/10);

    }

    static int stepcount(int n,int cou){
        if(n==0) return cou;
        if(n%2==0) {
            n = n / 2;
            cou += 1;
        }
        else
        {
            n=n-1;
            cou+=1;
        }
        return stepcount(n,cou);



    }
    }






