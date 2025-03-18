package edu.utdallas.cs2336;

public interface Part3SortedPreferences {

    /**
     * Get the root node
     * @return The root node; null if not available
     */
    Webpage getRoot();

    /**
     * Add a node in the proper position
     * NOTE: This needs to be added as a NEW node, not a simple assignment of the original node
     *
     * @param webpage Node to add
     */
    void add(Webpage webpage);

    /**
     * Find the given value by a binary search of the tree
     * @param value The value to search for
     * @return The node with this value, or null if there is no such node
     */
    Webpage find(int value);

    /**
     * Remove a node with that value, if found
     * @param value Integer to search for
     * @return The node, if found, with the tree re-configured without the missing node.
     */
    Webpage remove(int value);
}
