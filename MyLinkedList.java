import java.util.Scanner;

/**
 * Performing Linked list operation
 * like insert, append, popFirst, popLast, search, delete and size of list
 * @author Tushar Akhade
 * @since 25 Jun 2021
 */
public class MyLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyLinkedListFunctions myLinkedListFunctions = new MyLinkedListFunctions();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter 1 to Add item in the list \n2 to Delete item from linked list \n3 to Search item from linked list \n4 to find the size of the list \n5 to Print linked list \n6 to Exit");
            String  choice = scanner.next();
            switch (choice) {
                case "1":
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("Enter 1 to add item at First position \n2 to add item at Last position \n3 to add item at certain Index position \n4 to add item after Certain value/item \n5 to return Main menu. ");
                        String choice1 = scanner.next();
                        switch (choice1) {
                            case "1":
                                System.out.print("Enter the item to be inserted at First position : ");
                                int data = scanner.nextInt();
                                myLinkedListFunctions.insert(data);
                                break;
                            case "2":
                                System.out.print("Enter the item to be inserted at Last position : ");
                                int data1 = scanner.nextInt();
                                myLinkedListFunctions.append(data1);
                                break;
                            case "3":
                                System.out.print("Enter the item to be inserted : ");
                                int data3 = scanner.nextInt();
                                System.out.print("Enter the position of item to be inserted : ");
                                int position = scanner.nextInt();
                                myLinkedListFunctions.insertAt(position, data3);
                                break;
                            case "4":
                                System.out.print("Enter the item to be inserted : ");
                                int data4 = scanner.nextInt();
                                System.out.print("After which item you want to insert :");
                                int data5 = scanner.nextInt();
                                myLinkedListFunctions.insertAfter(data5, data4);
                                break;
                            default:
                                flag1 = false;
                                break;
                        }
                    }
                    System.out.println("---------------------------------------------********************----------------------------------------------------");
                    break;
                case "2":
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println("1 to delete item from First position\n2 to delete item from Last position \n3 to delete Specific item from linked list \n4 to go Main menu");
                        String choice2 = scanner.next();
                        switch (choice2) {
                            case "1":
                                myLinkedListFunctions.popFirst();
                                break;
                            case "2":
                                myLinkedListFunctions.popLast();
                                break;
                            case "3":
                                System.out.println("Enter the item to be deleted : ");
                                int data = scanner.nextInt();
                                myLinkedListFunctions.deleteByValue(data);
                                break;
                            default:
                                flag2 = false;
                                break;
                        }
                    }
                    System.out.println("---------------------------------------------********************----------------------------------------------------");
                    break;
                case "3":
                    System.out.print("Enter the item to be searched : ");
                    int data = scanner.nextInt();
                    System.out.println(myLinkedListFunctions.search(data));
                    System.out.println("---------------------------------------------********************----------------------------------------------------");
                    break;
                case "4":
                    System.out.println(myLinkedListFunctions.size());
                    System.out.println("---------------------------------------------********************----------------------------------------------------");
                    break;
                case "5":
                    myLinkedListFunctions.show();
                    System.out.println("---------------------------------------------********************----------------------------------------------------");
                    break;
                default:
                    flag = false;
            }
        }
    }
}
