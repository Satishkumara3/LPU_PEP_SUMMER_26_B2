import java.util.*;

public class Arrays_1 {
    public static void main(String args[]){
        System.out.println("hello java");
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }


    }
    
}
