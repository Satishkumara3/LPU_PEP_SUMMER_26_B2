import java.util.*;
class Custom_Comparator{
    public static void main(String args[]){
        System.out.println("Hello world");

        int[] arr={1,10,20,6,6,6,6,9,9,2};

        HashMap<Integer,Integer> mp=new HashMap<>();
        //Step 1 cout the frquency 
        for(int i=0;i<10;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        // convert int[] to Integer[];

        Integer[] nums =new Integer[10];
        for(int i=0;i<10;i++){
            nums[i]=arr[i];

        }


        // sort the object by custom comparator 

        Arrays.sort(nums,(a,b)-> mp.get(b)-mp.get(a));

        for(int i=0;i<10;i++){
            System.out.print(nums[i]+" ");
        }

    }
}