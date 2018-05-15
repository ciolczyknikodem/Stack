import java.util.EmptyStackException;

public class IntStack implements Stack {

    private final int[] array;
    private int top = -1;

    public IntStack() {
        this(10);
    }

    private IntStack(int stackSize) {
        array = new int[stackSize];
    }

    public int pop() {
        int value = peek();
        top--;
        return value;
    }

    public void push(int x) {
        if (isStackFull()) throw new StackException("Stack is full, can't add new element");

        array[++top] =  x;
    }

    public int peek() {
        if(isStackEmpty()) throw new EmptyStackException();
        return array[top];
    }

    private boolean isStackFull() {
        return top == array.length - 1;
    }

    private boolean isStackEmpty() {
        return top == -1;
    }
}
