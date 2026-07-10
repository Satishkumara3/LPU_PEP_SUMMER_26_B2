import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
        }
}

class Linkedlist{
    static Node head=null;
    public static void Build_list(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return;
        }
        
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        

    }


    public static void insert_begning(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return ;
        }

        newnode.next=head;
        head=newnode;
    }




     public static void insert_last(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            return ;
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }


    public static void display(){
        if(head==null){
            System.out.println("list is epmty");
            return ;
        }
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

        System.out.println();
    }


    // insert at nth position 

    public static void insertpos(int val,int pos){
        Node node=new Node(val);
      
        if(pos==1){
            node.next=node;
            return ;
        }
        int x=1;
        Node temp=head;
        while(x<pos-1 && temp!=null){
            temp=temp.next;
        }

        node.next=temp.next;
        temp.next=node;

    }


    public static void deletelast(){
        Node temp=head;
        if(temp==null|| temp.next==null ){
            head=null;
            return ;
        }
        while(temp.next.next!=null){
            temp=temp.next;    
        }
        temp.next=null;
    }

    public static void deletehead(){
        Node temp=head;
        if(temp==null){
            return ;
        }
        else{
            head=head.next;
        }
        
    }


    public static void deletenth(int n){
        int i=1;
        if(n==1){
            deletehead();
            return ;
        }
        Node prev=null;
        Node temp=head;
        while(i<n){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=temp.next;

    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 5 elements: ");
        for(int i=0;i<5;i++){
            int num=sc.nextInt();
           
            Build_list(num);
            
        }
        // insert_begning(100);
        // insert_last(200);

        // insertpos(400,3);


        // deletehead();
        // deletelast();
        System.out.println("before operation");
        display();

        deletenth(5);

         System.out.println("after operation");
        display();

    }
}