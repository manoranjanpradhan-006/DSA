package DataStructures.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {

        CostomQueue queue = new CostomQueue(5);

        queue.insert(5);
        queue.insert(15);
        queue.insert(25);
        queue.insert(35);
        queue.insert(45);

        // queue.display();

        // queue.remove();
        // queue.remove();
        // queue.remove();

        // queue.display();

        DynamicQueue dQueue = new DynamicQueue(5);

        dQueue.insert(45);
        dQueue.insert(63);
        dQueue.insert(67);
        dQueue.insert(84);
        dQueue.insert(75);
        dQueue.insert(65);
        dQueue.insert(43);
        dQueue.insert(99);
        dQueue.insert(94);

        // dQueue.display();

        // dQueue.remove();

        CircularQueue cQueue = new CircularQueue(5);

        cQueue.insert(7);
        cQueue.insert(71);
        cQueue.insert(711);
        cQueue.insert(7111);
        cQueue.insert(71111);

        // cQueue.display();

        // cQueue.remove();
        // cQueue.remove();

        // cQueue.insert(711111);

        // cQueue.display();
    }

}
