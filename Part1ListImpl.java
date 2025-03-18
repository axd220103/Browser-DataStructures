package edu.utdallas.cs2336;

public class Part1ListImpl implements Part1List {
    private Webpage head;
    private Webpage tail;
    private int size;

    public Part1ListImpl() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addToFront(Webpage newFirst) {
        if (head == null) {
            head = tail = newFirst;
        } else {
            newFirst.setRightNode(head);
            head = newFirst;
        }
        size++;
    }

    @Override
    public void addToBack(Webpage newLast) {
        if (head == null) {
            head = tail = newLast;
        } else {
            tail.setRightNode(newLast);
            tail = newLast;
        }
        size++;
    }

    @Override
    public void addAt(Webpage newItem, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addToFront(newItem);
        } else if (index == size) {
            addToBack(newItem);
        } else {
            Webpage current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getRightNode();
            }
            newItem.setRightNode(current.getRightNode());
            current.setRightNode(newItem);
            size++;
        }
    }

    @Override
    public Webpage getFirst() {
        return head;
    }

    @Override
    public Webpage getLast() {
        return tail;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Webpage getAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Webpage current = head;
        for (int i = 0; i < index; i++) {
            current = current.getRightNode();
        }
        return current;
    }

    @Override
    public Webpage removeFront() {
        if (head == null) return null;
        Webpage removed = head;
        head = head.getRightNode();
        if (head == null) tail = null;
        size--;
        return removed;
    }

    @Override
    public Webpage removeBack() {
        if (head == null) return null;
        if (head == tail) {
            Webpage removed = head;
            head = tail = null;
            size--;
            return removed;
        }
        Webpage current = head;
        while (current.getRightNode() != tail) {
            current = current.getRightNode();
        }
        Webpage removed = tail;
        tail = current;
        tail.setRightNode(null);
        size--;
        return removed;
    }

    @Override
    public Webpage removeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) return removeFront();
        Webpage current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getRightNode();
        }
        Webpage removed = current.getRightNode();
        current.setRightNode(removed.getRightNode());
        if (removed == tail) tail = current;
        size--;
        return removed;
    }
}
