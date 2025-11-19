public class peakelement {

        public static void main(String[] args) {
            int [] arr={2,3,5,9,14,11,5};

            int ans=peak(arr);
            System.out.println(arr[ans]);
        }
        static int peak(int[] arr){
            int start=0;
            int end=arr.length-1;
            while(start<end){

                int mid=start+(end-start)/2;
                if(arr[mid]>arr[mid+1])
                    end=mid;
                else
                    start=mid+1;

            }


            return start;
        }
    }


