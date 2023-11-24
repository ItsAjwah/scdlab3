import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    // Push an element onto the stack
    public void push(int element) {
        elements.add(element);
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int lastIndex = elements.size() - 1;
        int poppedElement = elements.get(lastIndex);
        elements.remove(lastIndex);
        return poppedElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int lastIndex = elements.size() - 1;
        return elements.get(lastIndex);
    }
}

