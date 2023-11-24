
public class main_q {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue elements to the queue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue elements from the queue
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Retrieve the size of the queue
        System.out.println("Size of the queue: " + queue.size());
    }
}
