import java.util.ArrayList;

class HashMap<K, V> {
    private class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private ArrayList<Entry<K, V>> buckets;
    private int capacity;
    private int size;

    HashMap() {
        this.capacity = 16;
        this.size = 0;
        this.buckets = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key) {
        return key.hashCode() % capacity;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = buckets.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = buckets.get(bucketIndex);
        Entry<K, V> newNode = new Entry<>(key, value);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);

        if ((1.0 * size) / capacity >= 0.7) {
            ArrayList<Entry<K, V>> temp = buckets;
            capacity = 2 * capacity;
            buckets = new ArrayList<>(capacity);
            size = 0;
            for (int i = 0; i < capacity; i++) {
                buckets.add(null);
            }
            for (Entry<K, V> headNode : temp) {
                while (headNode != null) {
                    put(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        Entry<K, V> head = buckets.get(bucketIndex);
        Entry<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            prev = head;
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        size--;
        if (prev != null) {
            prev.next = head.next;
        } else {
            buckets.set(bucketIndex, head.next);
        }
        return head.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Size of map: " + map.size());
        System.out.println("Value for key 'two': " + map.get("two"));
        map.remove("two");
        System.out.println("Size of map after removing key 'two': " + map.size());
    }
}
