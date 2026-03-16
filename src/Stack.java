import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(T newElement) {
        stack.add(newElement);
    }

    public T pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
}
