import java.util.*;

public class Tree {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }
    



    public static int  total(Node root){
        if(root==null){
            return 0;
        }

        return 1+total(root.left)+total(root.right);
    }



    public static void countleaf( Node root,int[] x){
        if(root==null) return;
        if(root.left==null && root.right==null){
            x[0]=x[0]+1;
        }

        countleaf( root.left,x);
        countleaf( root.right,x);

    }



    public static int Countleaf( Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null){
            
        }

        return Countleaf( root.left)+Countleaf( root.right);;
        

    }


    public static int Height(Node root){
        if(root==null){
            return 0;
        }

        return 1+Math.max(Height(root.left),Height(root.right));


    }
    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(20);

        root.left.left = new Node(3);
        root.left.right = new Node(7);

        root.right.left = new Node(15);
        root.right.right = new Node(25);

        // Tree created successfully

        int count= total(root);
        System.out.println(count);

        int[] x=new int[1];

        x[0]=0;
        
        countleaf(root,x);

        System.out.println(x[0]);
        System.out.println( Countleaf(root));

        int height=Height(root);



    }
}