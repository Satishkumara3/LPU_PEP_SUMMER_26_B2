import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class Circular_LinkedList {
    static Node head=null;
    



    public static void insert(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            head.next=head;
            return ;
        }

        Node temp=head;

        while(temp.next!=head){
            temp=temp.next;
        }
        newnode.next=head;
        temp.next=newnode;

    }




    public static void display(){
        if(head==null){
            System.out.println("empty circular linkedlist");
            return;
        }

        Node temp=head;
        while(temp.next!=head){
            System.err.println(temp.val);
            temp=temp.next;
        }
        System.err.println(temp.val);
    }
    public static void main(String arga[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            insert(sc.nextInt());
        }
        display();
    }
}
