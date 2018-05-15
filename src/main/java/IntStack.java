
public class IntStack implements Stack {

    private final int[] array;

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

    }

    public int peek() {
        return 0;
    }
}
