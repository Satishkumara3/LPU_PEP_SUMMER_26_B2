import java.util.*;
class Reverse_string {
    public static void main(String args[]){

        String str="hello world!";
        Stack<String> st=new Stack<>();

        for(int i=0;i<str.length();i++){
            String ans="";

            while( i<str.length() && str.charAt(i) !=' '){
                ans+=str.charAt(i);
                i++;
            }
            st.push(ans);
        }

        while(st.size()>0){
            if(st.size()==1){
                System.out.print(st.pop());
            }else{

                System.out.print(st.pop()+" ");
            }
        }

    }
}
