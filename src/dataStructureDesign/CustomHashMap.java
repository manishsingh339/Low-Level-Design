package dataStructureDesign;

import java.util.Objects;

class CustomHashMap<K, V> {
    private static  final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private Entry<K, V>[] table;
    private int size;

    public CustomHashMap() {
        table = new Entry[INITIAL_CAPACITY];
        size = 0;
    }

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    /**
     * Compute the index of a given key in the internal table.
     * <p>
     * This function takes a key and returns its corresponding index in the
     * internal table. The index is computed by taking the absolute value of
     * the key's hash code and taking the modulus with the current size of the
     * table.
     * <p>
     * @param key the key to compute the index for
     * @return the index of the given key in the internal table
     */
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }


    /**
     * Inserts a key-value pair into the hash map.
     *
     * If the key is already present, updates its value with the new one.
     * If the key is not present, adds a new entry with the given key and value.
     * Resizes the table if the load factor exceeds the specified threshold.
     *
     * @param key the key associated with the value
     * @param value the value to be stored with the key
     */
    public V put(K key, V value) {
        int index = hash(key);
        Entry<K, V> entry = new Entry<>(key, value);

        if(table[index] == null) {
            table[index] = entry;
        } else {
            Entry<K, V> current = table[index];
            Entry<K, V> prev = null;
            while(current != null) {
                if(Objects.equals(current.key, key)) {
                    current.value = value;
                    return value;
                }
                prev = current;
                current = current.next;
            }
            prev.next = entry;
        }
        size++;
        if((size * 1.0) / table.length > LOAD_FACTOR) {
            resize();
        }
        return value;
    }

    /**
     * Resizes the internal table to double its current size.
     *
     * <p>
     * This function is called when the load factor exceeds the specified
     * threshold. It creates a new table with double the size of the current
     * one, and then rehashes all the existing entries into the new table.
     *
     * <p>
     * The time complexity of this function is O(n), where n is the number of
     * entries in the map.
     */
    private void resize() {
        Entry<K, V>[] existingTable = new Entry[size*2];
        size = 0;

        for(Entry<K, V> entry : existingTable) {
            while (entry != null) {
                put(entry.key, entry.value);
                entry = entry.next;
            }
        }
    }

    /**
     * Returns the number of entries in the hash map.
     *
     * @return the number of entries in the hash map
     */
    public int size() {
        return size;
    }

    /**
     * Retrieves the value associated with the given key from the hash map.
     *
     * If the key is not present in the map, returns null.
     *
     * @param key the key of the entry to retrieve
     * @return the value associated with the given key, or null if no such entry exists
     */
    public V get(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        while (current != null) {
            if(Objects.equals(current.key, key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * Removes the entry with the specified key from the hash map.
     *
     * @param key the key of the entry to remove
     * @return the value associated with the removed entry, or null if no such entry exists
     */
    public V remove(K key) {
        int index = hash(key);
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;
        while (current != null) {
           if(Objects.equals(key, current.key)) {
                if(prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
           }
           prev = current;
           current = current.next;
        }
        return null;
    }

    /**
     * Prints the content of the hash map to the console in a formatted form.
     *
     * The output is a JSON-like string with the index of each entry followed by
     * a list of key-value pairs that are colliding at that index.
     */
    public void printMap() {
        Entry<K, V> current = null;
        System.out.println("{");
        for (Entry<K, V> entry : table) {
            if(entry != null) {
                System.out.println("Index "+hash(entry.key)+" [");
                while (entry != null) {
                    System.out.println("\t[ "+entry.key +": "+ entry.value+" ]");
                    entry = entry.next;
                }
                System.out.println("]");
            }
        }
        System.out.println("}");
    }
}


class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        System.out.println("Value for 'two': " + map.get("two"));  // Output: 2
        map.remove("two");
        System.out.println("Value for 'two' after removal: " + map.get("two"));  // Output: null
        System.out.println("Size: " + map.size());  // Output: 3

        map.printMap();  // Prints all key-value pairs in the HashMap
    }
}
