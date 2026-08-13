package DataStructures.Stack;

public class CostomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CostomStack() {
        this(DEFAULT_SIZE);
    }

    public CostomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {

        if (isFull()) {
            System.out.println("Stack is Full !");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from a empty Stack.");
            // System.out.println("Cannot pop from a empty stack.");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;

        return data[ptr--];
    }

    public int peek() throws Exception {

        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty Stack.");
            // System.out.println("Cannot peek from a empty Stack.");
        }

        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}
