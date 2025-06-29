/*Define a class Stack, which perform the basic operation of stack. Define another driver
class to demonstrate the basic operations.*/

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
 class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack");
        } else {
            System.out.println("Stack is full");
        }
    }

    public int pop() {
        if (top >= 0) {
            int popped = stackArray[top--];
            System.out.println(popped + " popped from stack");
            return popped;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

