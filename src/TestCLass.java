import java.util.*;

public class TestCLass {
    Node head;

    // cread a linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // method for add value
    void add(int data) {
        Node current = new Node(data);
        current.next = head;
        head = current;
    }

    // method for get size of the list
    int getSize() {
        Node node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public boolean isPalindrome() {
        int fSUm = 0, lSum = 0;
        int len = 0;
        Node current = head;
        while (current != null) {
            len++;
            current = current.next;
        }
        if (len <= 1) return true;
        int half = len / 2;
        if (len % 2 == 0) {
            for (int i = 1; i <= len; i++) {
                if (i <= half) {
                    fSUm += head.data;
                    head = head.next;
                } else {
                    lSum += head.data;
                    head = head.next;
                }
            }
        } else {
            for (int i = 1; i <= len; i++) {
                if (i <= half) {
                    fSUm += head.data;
                    head = head.next;
                } else if(i > half+1) {
                    lSum += head.data;
                    head = head.next;
                }
            }
        }
        return fSUm == lSum ? true : false;
    }

    public static void main(String[] args) {
        TestCLass list = new TestCLass();
        list.add(1);
        list.add(2);
        list.add(1);
        /*list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);*/

        // nSystem.out.println(list.isPalindrome());
        System.out.println(list.getSize());
        System.out.println(5/2);
    }
}



