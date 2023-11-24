import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> elements;

    public Queue() {
        elements = new LinkedList<>();
    }

    // Enqueue (add) an element to the queue
    public void enqueue(int element) {
        elements.addLast(element);
    }

    // Dequeue (remove) an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Retrieve the size of the queue
    public int size() {
        return elements.size();
    }
}
