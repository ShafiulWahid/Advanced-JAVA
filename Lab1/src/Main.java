import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];/

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();
            stack<integer>stack=new stack<integer>;




            queue<Integer> q1 = new queue<>();
            Scanner value1 = new Scanner(System.in);

            System.out.println("Enter Number of enter On Queue:");

            int Number1 = value1.nextInt();

            for (int Number1 = 0; i < Number1; i++) {
                int number2 = value1.nextInt();
                q1.enqueue(number2);
            }

            System.out.println(
                    "q1 after enqueue of 3 elements:\n" + q1);
            q1.dequeue();
            System.out.println("q1 after dequeue :\n" + q1);

            queue<String> q2 = new queue<>();

            q2.enqueue("hello");
            q2.enqueue("world");
            q2.enqueue("GFG");

            // Print the queue after inserting string elements
            System.out.println(
                    "\nq2 after enqueue of 3 elements:\n" + q2);

            System.out.println("q2 front = " + q2.front()
                    + ", q2 rear = " + q2.rear());

            queue<Float> q3 = new queue<>();

            System.out.println(
                    "\nCreated new Float type queue q3...");

            System.out.println(
                    "Checking if queue is empty or not :\n"
                            + q3.empty());
    }
}