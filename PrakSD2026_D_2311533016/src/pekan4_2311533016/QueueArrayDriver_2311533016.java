package pekan4_2311533016;

public class QueueArrayDriver_2311533016 {
    public static void main(String[] args) {

        QueueArray_2311533016 queue_3016 = new QueueArray_2311533016(1000);

        queue_3016.enqueue(10);
        queue_3016.enqueue(20);
        queue_3016.enqueue(30);
        queue_3016.enqueue(40);

        System.out.println("Item di depan " + queue_3016.front());
        System.out.println("item paling belakang " + queue_3016.rear());

        System.out.println("tampilan queue");
        queue_3016.display();

        System.out.println();

        System.out.println(queue_3016.dequeue() + " dihapus dari queue");

        System.out.println("item di depan: " + queue_3016.front());
        System.out.println("item dibelakang: " + queue_3016.rear());

        System.out.println("tampilan queue setelah satu data dihapus");
        queue_3016.display();
    }
}