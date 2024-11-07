package org.example;

public interface Iterator {
    /**
     * Check if a list have another element after the actual
     * @return True if the list have another element after the actual element
     */
    boolean hasNext();

    /**
     * Returns the next element on a list of Objects
     * @return The next element on a list of Objects
     */
    Object next();
}
