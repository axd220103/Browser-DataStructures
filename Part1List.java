package edu.utdallas.cs2336;

/**
 * Interface for a singly-linked list
 * @param <T>
 */
public interface Part1List {
    void addToFront(Webpage newFirst);
    void addToBack(Webpage newLast);

    /**
     * Add an item at the specified index
     * @param newItem Item to add
     * @param index Index to add it
     */
    void addAt(Webpage newItem, final int index);

    /**
     * Get the first node
     * @return The first node, or null if the list is empty
     */
    Webpage getFirst();

    /**
     * Get the last node
     * @return The last node, or null if the list is empty
     */
    Webpage getLast();

    /**
     * Get the size of the list
     * @return Size of the list
     */
    int getSize();

    /**
     * Get the node at this index
     * @param index Index to check
     * @return Node at that index
     */
    Webpage getAt(int index);

    /**
     * Remove the first node
     * @return The removed node (if any)
     */
    Webpage removeFront();

    /**
     * Remove the last node
     * @return The removed node (if any)
     */
    Webpage removeBack();

    /**
     * Remove the node at this index
     * @param index The index to remove
     * @return The removed node
     */
    Webpage removeAt(int index);

}
