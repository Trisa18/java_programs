public class uniqueEle {
    public static void main(String[] args) {
        int[] arr = {10, 7, 19, 20, 20, 7, 10};

        System.out.println(unique(arr));

    }

        static int unique(int [] arr){
        int res=0;
        for(int i=0;i<arr.length;i++) {
            res = res ^ arr[i];
        }
        return res;
        }

    }
