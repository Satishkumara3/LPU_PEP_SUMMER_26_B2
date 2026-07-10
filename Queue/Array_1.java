import java.util.*;

public class Array_1 {
    public static class QUeue{
        int[] arr;
        int front;
        int rear;
        int size;

        QUeue(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
            front=-1;

        }


        void enque(int val){
            if(rear==size-1) {
                System.out.println("Queue overflow");
                return ;
            }

            if(front ==-1){
                front=0;
            }
            rear++;
            arr[rear]=val;   

        }

        void deque(){
            if(front==-1 || front> rear){
                System.out.println("Queue Underflow");
                return ;
            }

            front++;
        }

        int get_getfront(){
            if(front==-1 || front >rear){
                System.out.println("Queue have no element");
                return -1;
            }

            return arr[front];

        }
        public void display(){
            if(front==-1 || front >rear){
                System.out.println("Queue have no element");
                return;
            }

            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }


    }
    public static void main(String args[]){
        System.out.println("Queue implementatio using array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        QUeue obj=new QUeue(n);


        obj.enque(1);
        obj.enque(2);
        obj.enque(3);
        obj.enque(4);
        obj.deque();
        obj.deque();
        obj.deque();
        obj.deque();
        obj.deque();


        obj.display();




    }
}
