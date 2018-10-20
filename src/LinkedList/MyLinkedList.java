package LinkedList;

public class MyLinkedList {
    class Node {
        int val;
        Node next, prev;

        Node(int val) {
            this.val = val;
        }
    }

    Node head, tail;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node current = head.next;
        while (index > 0 && current != tail) {
            index--;
            current = current.next;
        }
        return index > 0 ? -1 : current.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }


    public void addAtTail(int val) {
        Node node = new Node(val);
        node.prev = tail.prev;
        node.prev.next = node;
        tail.prev = node;
        node.next = tail;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node current = head.next;
        while (index > 0 && current != tail) {
            index--;
            current = current.next;
        }
        if (index > 0) return;

        Node node = new Node(val);
        node.prev = current.prev;
        node.prev.next = node;
        node.next = current;
        current.prev = node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0) return;
        Node current = head.next;
        while (index > 0 && current != tail) {
            index--;
            current = current.next;
        }
        if (index > 0 || current == tail) return;
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }
}
