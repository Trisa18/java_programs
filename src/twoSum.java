public class twoSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50};
        int target = 50;
        twosum(arr, target);
    }


    static void twosum(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int sum = arr[s] + arr[e];

            if (sum == target) {
                System.out.println(arr[s] + " " + arr[e]);
                return;
            }

            if (sum < target) {
                s++;
            } else {
                e--;
            }
        }

        System.out.println("No pair found");
    }


}

