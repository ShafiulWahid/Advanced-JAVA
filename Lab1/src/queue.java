import java.io.*;

import java.util.*;

class queue<T> {
    int front = -1, rear = -1;

    ArrayList<T> A = new ArrayList<>();

    T front()
    {
        // If it is not pointing to any element in queue
        if (front == -1)

            return null;

        // else return the front element
        return A.get(front);
    }
    T rear()
    {
        // If it is not pointing to any element in queue
        if (rear == -1)
            return null;
        return A.get(rear);
    }
    void enqueue(T X)
    {
        // If queue is empty
        if (this.empty()) {
            front = 0;
            rear = 0;
            A.add(X);
        }

        // If queue is not empty
        else {
            front++;
            if (A.size() > front) {

                A.set(front, X);
            }
            else

                A.add(X);
        }
    }
    void dequeue()
    {
        if (this.empty())

            System.out.println("Queue is already empty");

        else if (front == rear) {

            front = rear = -1;
        }

        else {

            rear++;
        }
    }

    boolean empty()
    {
        if (front == -1 && rear == -1)
            return true;
        return false;
    }
    public String toString()
    {
        if (this.empty())
            return "";

        String Ans = "";

        for (int i = rear; i < front; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }

        Ans += String.valueOf(A.get(front));

        return Ans;
    }
}
