package JavaStudy.HashTable;

import java.util.LinkedList;

public class HastTable<K,V> {
    private static final int MAX_SIZE = 100;
    private final LinkedList<Entry<K,V>>[] map;

    public HastTable() {
        this.map = new LinkedList[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) {
            this.map[i] = new LinkedList<>();
        }
    }

    private int getHash(K key) {
        return key.hashCode() % MAX_SIZE;
    }

    public void put(K key,V value) {
        int index = getHash(key);
        LinkedList<Entry<K,V>> data = this.map[index];

//        dupe valid
        for (Entry<K,V> entry : data) {
            if (entry.key().equals(key)) {
                throw new IllegalArgumentException(
                        "Duplicate Key " + key);
            }
        }

//        add Data
        data.add(new Entry<>(key,value));
    }

    public V get(K key) {
        int index = getHash(key);
        LinkedList<Entry<K,V>> data = this.map[index];

        for (Entry<K,V> entry : data) {
            if (entry.key().equals(key))
                return entry.value();
        }
        return null;
    }

    public void update(K key,V value) {
        int index = getHash(key);
        LinkedList<Entry<K,V>> data = this.map[index];

        for (Entry<K,V> entry : data) {
            if (entry.key().equals(key)) {
                data.remove(entry);
                data.add(new Entry<>(key,value));
                return;
            }
        }
    }

    public void remove (K key) {
        int index = getHash(key);
        LinkedList<Entry<K,V>> data = this.map[index];

        for (Entry<K,V> entry : data) {
            if (entry.key().equals(key))
                data.remove(entry);
        }
    }
}
