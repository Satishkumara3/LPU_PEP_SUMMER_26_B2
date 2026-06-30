// Q2 find the maximum sum of subset of array 

import java.util.Scanner;

public class tcs_Q {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }



        int zero=0;
        int negative=0;
        int max_negative=Integer.MIN_VALUE;


        for(int i=0;i<n;i++){
            if(arr[i]==0) zero++;
            else if(arr[i]<0){
                negative++;
                max_negative=Math.max(max_negative,arr[i]);
            }
        }

        int ans=1;
        for(int i=0;i<n;i++){
            if(negative%2==0){
                if(arr[i]!=0){
                    ans=ans*arr[i];
                }
            }
            else if(negative%2!=0){
                if(arr[i]!=0 && arr[i]!=max_negative){
                    ans=ans*arr[i];
                }
            }

            
        }
        System.out.println(ans);
    }
}
