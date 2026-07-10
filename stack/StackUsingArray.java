import java.util.*;

public class StackUsingArray {


    static class Stack {
        int[] arr;
        int top;
        int size;

        // Constructor
        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }

        // Push Operation
        public void push(int value) {
            if (top == size - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = value;
        }

        // Pop Operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        // Peek Operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        // Check if Stack is Empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Check if Stack is Full
        public boolean isFull() {
            return top == size - 1;
        }

        // Display Stack
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }

            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Size of Stack
        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {

        Stack st = new Stack(5);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();

        System.out.println("Top Element: " + st.peek());

        System.out.println("Popped: " + st.pop());

        st.display();

        System.out.println("Current Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());

        System.out.println("Is Full: " + st.isFull());
    }
    
}
