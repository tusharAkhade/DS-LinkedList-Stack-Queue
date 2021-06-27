import java.util.Scanner;
/**
 * Performing queue data structure operations
 * like enqueue, dequeue, size
 * @author Tushar Akhade
 * @since 25 Jun 2021
 */
public class MyQueue<T> {
    MyLinkedListFunctions myLinkedListFunctions = new MyLinkedListFunctions();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyQueue myQueue = new MyQueue();
        Boolean flag = true;
        while (flag) {
            System.out.println("Enter 1 to enqueue item into queue \nEnter 2 to dequeue item from queue \nEnter 3 to print Size of queue \nEnter 4 to show queue item \nEnter 5 to exit");
            String option = scanner.next();
            switch (option) {
                case "1":
                    System.out.println("Enter value to be inserted : ");
                    int data = scanner.nextInt();
                    myQueue.enqueue(data);
                    break;
                case "2":
                    myQueue.dequeue();
                    break;
                case "3":
                    System.out.println(myQueue.size());
                    break;
                case "4":
                    myQueue.show();
                    break;
                default:
                    flag = false;
            }
        }
    }

    // 'enqueue()' will add item at last position
    public void enqueue(T data) {
        myLinkedListFunctions.append(data);
    }

    // 'dequeue()' will remove item from last position
    public void dequeue() {
        myLinkedListFunctions.popFirst();
    }

    // 'isEmpty' checks whether queue is empty or not
    public boolean isEmpty() {
        if (myLinkedListFunctions.size() > 0) {
            return false;
        }
        return true;
    }

    // 'size()' will return the size of queue
    public int size() {
        return myLinkedListFunctions.size();
    }

    public void show() {
        myLinkedListFunctions.show();
    }
}
