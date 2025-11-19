public class leetcode3 {

        public static void main(String[] args) {
            char [] arr={'a','d','g','l'};
            int target='c';
            int ans=ceil(arr,target);
            System.out.println(arr[ans]);
        }
        static int ceil(char[] arr,int target){
            int start=0;
            int end=arr.length-1;
            if(target>=arr[arr.length-1]){
                return start;
            }


            while(start<=end){

                int mid=start+(end-start)/2;
                if(target<arr[mid])
                    end=mid-1;
                else if(target>arr[mid])
                    start=mid+1;


            }


            return start;
        }
    }


