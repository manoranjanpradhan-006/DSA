package DataStructures.Queue;

public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int start = 0;
    int end = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }
}
