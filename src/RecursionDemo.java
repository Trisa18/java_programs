import org.w3c.dom.ls.LSOutput;

public class RecursionDemo {
    public static void main(String[] args) {
        print(1);
        System.out.println();
        System.out.println("fibo of 7= " + (fibonacci(7)));
        System.out.println();
        int[] arr = {-18, -14, -4, 3, 5, 6, 8, 9, 14};
        int target = 5;
        int binsearch = binsearch(arr, target, 0, arr.length - 1);
        System.out.println("target is at index: "+binsearch);
    }

    static void print(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    static int fibonacci(int n) {

        if (n < 2)
            return n;


                return fibonacci(n-1) + fibonacci(n - 2);


    }
    static int binsearch(int arr [],int target,int s,int e){

        int m=s+(e-s)/2;
        if(s>e)
            return -1;


        if (target< arr[m])
             return binsearch(arr,target,s,m-1);
        else if (target> arr[m])
             return binsearch(arr,target,m+1,e);
        else {
            return m;
        }

    }

}

