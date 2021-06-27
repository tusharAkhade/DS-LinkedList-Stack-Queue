import java.util.Scanner;

/**
 * Performing stack operation
 * like push, pop, peek
 * @author Tushar Akhade
 * @since 25 Jun 2021
 */
public class MyStack<T> {
    MyLinkedListFunctions myLinkedListFunctions = new MyLinkedListFunctions();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack myStack = new MyStack();
        Boolean flag = true;
        while (flag) {
            System.out.println("Enter 1 to push item into stack \nEnter 2 to pop item from stack \nEnter 3 to print Peek item \nEnter 4 to print Size of stack \nEnter 5 to show stack item \nEnter 6 to exit");
            String option = scanner.next();
            switch (option) {
                case "1":
                    System.out.println("Enter value to be inserted : ");
                    int data = scanner.nextInt();
                    myStack.push(data);
                    break;
                case "2":
                    myStack.pop();
                    break;
                case "3":
                    System.out.println(myStack.peek());
                    break;
                case "4":
                    System.out.println(myStack.size());
                    break;
                case "5":
                    myStack.show();
                    break;
                default:
                    flag = false;
            }
        }
    }

    // 'push()' will push/add item at last position
    public void push(T data) {
        myLinkedListFunctions.insert(data);
    }

    // 'pop()' will remove/pop first item
    public void pop() {
        myLinkedListFunctions.popFirst();
    }

    // 'peak()' will return top item
    public T peek() {
        if (!isEmpty()) {
            return (T) myLinkedListFunctions.head();
        }
        return (T) "empty";
    }

    // 'isEmpty' checks whether stack is empty or not
    public boolean isEmpty() {
        if (myLinkedListFunctions.size() > 0) {
            return false;
        }
        return true;
    }

    // 'size()' will retun size of the stack
    public int size() {
        return myLinkedListFunctions.size();
    }

    public void show() {
        myLinkedListFunctions.show();
    }
}
