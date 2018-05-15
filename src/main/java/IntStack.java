
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
        return 0;
    }

    public void push(int x) {
        if (isStackFull()) throw new StackException();

        
    }

    public int peek() {
        return 0;
    }

    private boolean isStackFull() {
        return top == array.length - 1;
    }
}
