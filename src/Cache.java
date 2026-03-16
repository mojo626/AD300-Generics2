import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Cache<T> {
    HashMap<Integer, T> cache;

    public Cache() {
        cache = new HashMap<>();
    }

    public void addItem(int key, T value) {
        cache.put(key, value);
    }

    public T getItem(int key) {
        return cache.get(key);
    }

    public void clearCache() {
        cache.clear();
    }
    
    public Set<Entry<Integer,T>> getEntrySet() {
        return cache.entrySet();
    }

    @Override
    public String toString() {
        String str = "Cache: \n";

        for (Entry<Integer, T> item : this.cache.entrySet()) {
            str += item.getKey() + ": " + item.getValue().toString() + "\n";
        }

        return str;
    }

    public void addAll(Cache<? super T> other) {
        for (Entry<Integer, ? super T> item : other.getEntrySet()) {
            this.addItem(item.getKey(), (T) item.getValue());
        }
    }
}
