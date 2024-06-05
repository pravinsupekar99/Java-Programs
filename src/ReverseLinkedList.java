

    // Java program for reversing the Linked list
import java.util.*;
    class ReverseLinkedList {

        static Node head;

        static class Node {

            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        // Method to add a new node at the end of the list
        void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // A simple and tail recursive function to reverse
        // a linked list. prev is passed as NULL initially.
        Node reverseUtil(Node curr, Node prev) {

            /* If last node mark it head */
            if (curr.next == null) {
                head = curr;

                /* Update next to prev node */
                curr.next = prev;
                return null;
            }

            /* Save curr->next node for recursive call */
            Node next1 = curr.next;

            /* and update next ..*/
            curr.next = prev;

            reverseUtil(next1, curr);
            return head;
        }

        // prints content of double linked list
        void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        public static void main(String[] args) {
            ReverseLinkedList list = new ReverseLinkedList();
            // Adding nodes using a loop
            System.out.println("ENTER NUMBER : ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println("ENTER INPUT : ");
            for (int i = 1; i <= num; i++) {
                list.addNode(scanner.nextInt());
            }

            System.out.println("Original Linked list ");
            list.printList(head);
            Node res = list.reverseUtil(head, null);
            System.out.println("\n\nReversed linked list ");
            list.printList(res);
        }
    }


