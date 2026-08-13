package DataStructures.Queue;

public class CostomQueue {

    int ptr = -1;
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CostomQueue() {
        this(DEFAULT_SIZE);
    }

    public CostomQueue(int size) {
        this.data = new int[size];
    }
}