import java.util.Arrays;

public class array_practice {
    public static void main(String[] args) {
        int [] arr={1,5,3,7,3,2,3,6,3};
        System.out.println(maxele(arr));
        System.out.println(counttarget(arr,3));

        int [] arr1={1,4,2,7,3};
        int [] arr2={1,5,7,9,10};
        issorted(arr1);
        issorted(arr2);
        int [] arr3={1,4,2,7,3};
        rev(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(sumele(arr1));
        System.out.println(sum_rec(arr1,0,0));

        int [] arr4={1,6,3,8,9,5};
        System.out.println(secondLargest(arr4));
        System.out.println(secondSmallest(arr4));





    }





    static int maxele(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]> max)
                max=arr[i];

        }
        return max;
    }

    static int counttarget(int [] arr,int target){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target)
                count++;
        }
        return count;
    }


    static void issorted(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                count++;
        }
        if (count > 0) {
            System.out.println("not sorted");
        } else
            System.out.println("sorted");
    }

    static void rev(int [] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }


    static int sumele(int [] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;



    }

    static int sum_rec(int [] arr,int s,int sum){
        if(s==arr.length) return sum;
        sum=sum+arr[s];
        return sum_rec(arr,s+1,sum);



    }

    static int secondLargest(int[] arr) {

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        return arr[arr.length - 2];   // second largest
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int secondSmallest(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            }
        }
        return arr[1];
    }







}
