import java.util.Scanner;

public class Stack {
    static final int MAX = 1000;
    int top;
    int[] stack = new int[MAX];

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            stack[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = stack[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return stack[top];
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " popped from stack");
    }
}

