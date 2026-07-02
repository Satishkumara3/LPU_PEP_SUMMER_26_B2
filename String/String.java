import java.util.*;
class string {
    public static void reverse(String str){
        char[] arr=str.toCharArray();

        int i=0;
        int j=arr.length-1;

        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        System.out.println(arr.toString());

    }
    public static void main(String args[]){
        String str = "Hello";
        reverse(str);
    }
    
}
