import java.util.ArrayList;

public class Recursion_arrays {
    public static void main(String[] args) {
        int [] arr={1,2,3,45};
        int [] arr1={1,2,3,3,4,5};
        issorted(arr);
        System.out.println(  issorted(arr));
        System.out.println(issorted_rec(arr,0));
        System.out.println(linsearch(arr,3));
        System.out.println(linseatch_rec(arr,6,0));
       mult_linsearch_rec(arr1,3,0);
        System.out.println(list);
        System.out.println(findallindex(arr1,3,0,new ArrayList<>()));
        System.out.println(findallindex2(arr1,3,0));

    }





    static boolean issorted (int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                   return false;
                }
            }
        }
        return true;
    }

    static boolean issorted_rec(int [] arr,int index){

        if(index==arr.length-1)
            return true;


        return arr[index]<arr[index+1] && issorted_rec(arr,index+1);

    }

    static int linsearch(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target) return i;

        }
        return -1;
    }
    static int linseatch_rec(int[] arr,int target,int i){
        if(i==arr.length) return -1;

        if(arr[i]==target) return i;
        return linseatch_rec(arr,target,i+1);
    }


    static ArrayList<Integer> list=new ArrayList<>();
    static void mult_linsearch_rec(int [] arr,int target,int i){

        if(i==arr.length)  return;

        if(arr[i]==target) list.add(i);
        mult_linsearch_rec(arr,target,i+1);

    }

    static ArrayList<Integer> findallindex(int [] arr,int target,int i,ArrayList<Integer> list){
        if(i==arr.length)  return list;

        if(arr[i]==target) list.add(i);
         return findallindex(arr,target,i+1,list);


    }

    static ArrayList<Integer> findallindex2(int [] arr,int target,int i){
        ArrayList<Integer> list= new ArrayList<>();
        if(i==arr.length)  return list;

        if(arr[i]==target) list.add(i);
        ArrayList<Integer>result= findallindex2(arr,target,i+1);
        list.addAll(result);
        return list;

    }


    }