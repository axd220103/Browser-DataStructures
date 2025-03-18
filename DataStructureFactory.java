package edu.utdallas.cs2336;

/**
 * Where you will create objects of your new types
 */
public class DataStructureFactory {

    /**
     * Create your implementation of Part1List (singly-linked list)
     *
     * @return Singly-linked list
     */
    public static Part1List createPart1List() {
        return new Part1ListImpl();
    }

    /**
     * Create your implementation of Part2History (stack)
     *
     * @return Stack
     */
    public static Part2History createHistory() {
        return null;
    }

    /**
     * Create your implementation of Part2ReadingList (queue)
     *
     * @return Queue
     */
    public static Part2ReadingList createReadingList() {
        return null;
    }

    /**
     * Create your implementation of a doubly-linked list
     * While it is a "Part1List", you must create a doubly-linked
     * list for it to pass the tests
     *
     * @return Doubly-linked list
     */
    public static Part1List createSavedLinks() {
        return null;
    }

    /**
     * Create your implementation of Part3SortedPreferences (binary search tree)
     *
     * @return Binary search tree
     */
    public static Part3SortedPreferences createSortedPreferences() {
        return null;
    }
}
