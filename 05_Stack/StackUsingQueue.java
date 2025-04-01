import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>(); // Temporary queue
    private Queue<Integer> q2 = new LinkedList<>(); // Main queue acting as a stack

    /**
     * Push operation (O(n) time complexity)
     * - Move all elements from q2 to q1.
     * - Insert the new element into q2.
     * - Move all elements back from q1 to q2.
     */
    public void push(int x) {
        // Move all elements from q2 to q1
        while (!q2.isEmpty()) {
            q1.add(q2.poll());
        }

        // Add new element to q2
        q2.add(x);

        // Move elements back from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
    }

    /**
     * Pop operation (O(1) time complexity)
     * - Removes the top element from the stack (i.e., front of q2).
     * - If the stack is empty, return -1.
     */
    public int pop() {
        if (q2.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q2.poll();
    }

    /**
     * Peek operation (O(1) time complexity)
     * - Returns the top element of the stack (front of q2) without removing it.
     * - If the stack is empty, return -1.
     */
    public int top() {
        if (q2.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q2.peek();
    }

    /**
     * Check if the stack is empty
     * - Returns true if q2 is empty, otherwise false.
     */
    public boolean isEmpty() {
        return q2.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top()); // Output: 30
        System.out.println("Pop: " + stack.pop()); // Output: 30
        System.out.println("Pop: " + stack.pop()); // Output: 20
        System.out.println("Is Empty: " + stack.isEmpty()); // Output: false
        System.out.println("Pop: " + stack.pop()); // Output: 10
        System.out.println("Is Empty: " + stack.isEmpty()); // Output: true
    }
}
