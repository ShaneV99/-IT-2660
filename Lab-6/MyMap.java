
public interface MyMap<K, V> {
    public void put(K key, V value);
    public V get(K key);
    public void remove(K key);
    public boolean containsKey(K key);
    public java.util.Set<K> keySet();
    public java.util.Set<V> values();
}