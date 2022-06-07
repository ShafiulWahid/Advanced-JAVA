
public class Stack<T> {
    public Stack(Class<T> clazz, int capacity) {
        array = (T[])Array.newInstance(clazz, capacity);
    }

    private final T[] array;
}
