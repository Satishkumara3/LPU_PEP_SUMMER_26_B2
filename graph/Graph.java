import java.util.*;
/**
 * Graph
*/
public class Graph {

    public static void main(String [] args){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the number of nodes ");
        int n=sc.nextInt() ;// number of vertices
        System.out.println("eneter the number of edges ");
        int m=sc.nextInt() ;// number of edges

        HashMap<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(i,new ArrayList<>());
        }


        for(int i=0;i<m;i++){
            System.out.println("node u ");
            int u=sc.nextInt();
            System.out.println("node v");
            int v=sc.nextInt();
            List<Integer> ls=mp.get(u);
            ls.add(v);
            mp.put(u,ls);
            List<Integer> lss=mp.get(v);
            lss.add(u);
            mp.put(v,lss);

        }




        System.out.println("Adjaccency list");
        for(int i=0;i<n;i++){
            List<Integer> ls=mp.get(i);
            
            System.out.print(i+"->");
            for(int j=0;j<ls.size();j++){
                System.out.print(ls.get(j)+" ");
            }
            System.out.print("\n");

        }

    }

}