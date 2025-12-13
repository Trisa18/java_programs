import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class removeduplicates {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,5,3};
        removeduplicates(arr);
        System.out.println(list);

    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void removeduplicates(int[] arr) {
        list.clear();
        Arrays.sort(arr);

        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
    }



}
