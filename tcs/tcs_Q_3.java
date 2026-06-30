import java.util.HashMap;
import java.util.*;

public class tcs_Q_3 {

    public static int minswap(int[] arra,int[] arrb){

        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arra.length;i++){
            mp.put(arra[i],i);
        }
        int swap=0;
        for(int i=0;i<arrb.length;i++){
            int index=mp.get(arrb[i]);
            if(index!=i){
                int temp=arra[i];
                arra[i]=arra[index];
                arra[index]=temp;
                mp.put(arra[i],i);
                mp.put(arra[index],index);
                swap++;
            }
        }
        return swap;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arra = new int[n];
        int[] arrb = new int[n];

        for (int i = 0; i < n; i++)
            arra[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            arrb[i] = sc.nextInt();

        System.out.println(minswap(arra, arrb));
    }


      
}
