package stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    // Corrected Constructor (Removed void)
    public ImplementStackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x); // Push new element into q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll()); // Move all elements from q1 to q2
        }
        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (empty()) {
            throw new RuntimeException("Stack is empty! Cannot pop.");
        }
        return q1.poll(); // Remove top element
    }

    public int top() {
        if (empty()) {
            throw new RuntimeException("Stack is empty! Cannot get top element.");
        }
        return q1.peek(); // Get top element
    }

    public boolean empty() {
        return q1.isEmpty(); // Check if empty
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues myStack = new ImplementStackUsingQueues(); // Constructor is now correct

        // Pushing elements into the stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        // Getting the top element
        System.out.println("Top element: " + myStack.top()); // Output: 3

        // Popping an element
        System.out.println("Popped element: " + myStack.pop()); // Output: 3

        // Checking the top element after pop
        System.out.println("Top element after pop: " + myStack.top()); // Output: 2

        // Checking if stack is empty
        System.out.println("Is stack empty? " + myStack.empty()); // Output: false

        // Popping remaining elements
        myStack.pop();
        myStack.pop();

        // Checking if stack is empty after all pops
        System.out.println("Is stack empty after all pops? " + myStack.empty()); // Output: true
    }
}
