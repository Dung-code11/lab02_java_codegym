package com.mycompany.studyjavaincodegym.Chuong10;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
        head = null;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNodes++;
        }
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        Node removed;
        if (index == 0) {
            removed = head;
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            removed = temp.next;
            temp.next = removed.next;
        }
        numNodes--;
        return (E) removed.data;
    }

    public boolean remove(Object e) {
        if (head == null) return false;

        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(e)) {
                temp.next = temp.next.next;
                numNodes--;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            newList.add((E) temp.data);
            temp = temp.next;
        }
        return newList;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + numNodes);
        }

        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        if (head == null) return null;
        return (E) head.data;
    }

    public E getLast() {
        if (head == null) return null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void ensureCapacity(int minCapacity) {
        // Không cần trong LinkedList
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");

        list.add(1, "D"); // chèn "D" vào vị trí 1

        list.addLast("E");

        System.out.println("Danh sách:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Phần tử đầu tiên: " + list.getFirst());
        System.out.println("Phần tử cuối cùng: " + list.getLast());

        list.remove(1);
        System.out.println("Sau khi xóa vị trí 1:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Chứa 'C'? " + list.contains("C"));
        System.out.println("Index của 'E': " + list.indexOf("E"));

        MyLinkedList<String> cloneList = list.clone();
        System.out.println("Danh sách clone:");
        for (int i = 0; i < cloneList.size(); i++) {
            System.out.println(cloneList.get(i));
        }

        list.clear();
        System.out.println("Đã clear, size: " + list.size());
    }
}

}
