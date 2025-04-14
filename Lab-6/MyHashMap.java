import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] table;
    public MyHashMap() {
        table = new LinkedList[DEFAULT_CAPACITY];
    }
    @Override
    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null)
            table[index] = new LinkedList<>();
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
    }
    @Override
    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.key.equals(key))
                    return entry.value;
            }
        }
        return null;
    }
    @Override
    public void remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            Iterator<Entry<K, V>> it = table[index].iterator();
            while (it.hasNext()) {
                if (it.next().key.equals(key)) {
                    it.remove();
                    return;
                }
            }
        }
    }
    @Override
    public boolean containsKey(K key) {
        return get(key) != null;
    }
    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (LinkedList<Entry<K, V>> bucket : table) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket)
                    set.add(entry.key);
            }
        }
        return set;
    }
    @Override
    public Set<V> values() {
        Set<V> set = new HashSet<>();
        for (LinkedList<Entry<K, V>> bucket : table) {
            if (bucket != null) {
                for (Entry<K, V> entry : bucket)
                    set.add(entry.value);
            }
        }
        return set;
    }
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }
    private static class Entry<K, V> {
        K key;
        V value;
        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}