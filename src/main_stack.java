
public class main_stack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Pop the remaining element
        System.out.println("Popped element: " + stack.pop());

        // Check if the stack is empty again
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
