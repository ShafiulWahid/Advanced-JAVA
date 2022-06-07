public class Stack<T> {
    public Stack(Class<T> c, int size) {
        array = (T[])Array.newElement(c, size);
    }

    private final T[] array;
}

    public boolean isempty(){
        return top == -1;
    }
    public boolean isfull (){
        return top== size -1;
    }
    public void push(T size) {
        if (!this.isfull()) {
            ++top;
            array[top] = size;
        }
    }
     public void pop (T size){
            if(!this.empty()){
                return array [top--];
            }
        }


}
