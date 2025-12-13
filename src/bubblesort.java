import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int []a={1,5,2,7,4,9};
        bubble_sort(a);
        System.out.println(Arrays.toString(a));

    }

    static void bubble_sort(int [] arr){
        boolean swap;
        for(int i=0;i<arr.length-1;i++){
            swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }

    }
}
