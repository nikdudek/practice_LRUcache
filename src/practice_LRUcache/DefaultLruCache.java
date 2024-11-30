package practice_LRUcache;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer> implements LruCache {

	private int capacity;
	
	public DefaultLruCache() {
		super(16, 0.75f, true);
	}
	
	public DefaultLruCache(int capacity) {
		super(16, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
	public int get(int key) {
		if (super.containsKey(key)) {
			return super.get(key);
		}
		return -1;
	}

	@Override
	public void put(int key, int value) {
		super.put(key, value);
	}

	@Override
	public void setCapacity(int newCapacity) {
		capacity = newCapacity;

	}
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
		if (size() > this.capacity) {
			return true;
		}
		return false;
	}

}
