package pekan4_2311533016;

public class QueueArray_2311533016 {
    int front, rear, size;
    int capacity;
    int array[];

    public QueueArray_2311533016(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    boolean isFull(QueueArray_2311533016 queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(QueueArray_2311533016 queue) {
        return (queue.size == 0);
    }

    void enqueue(int item) {
        if (isFull(this)) {
            System.out.println("Queue penuh");
            return;
        }

        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;

        System.out.println(item + " masuk ke queue");
    }
}