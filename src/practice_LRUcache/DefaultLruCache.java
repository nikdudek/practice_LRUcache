package practice_LRUcache;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer> implements LruCache {

	public DefaultLruCache() {
		// TODO Auto-generated constructor stub
	}

	public DefaultLruCache(int initialCapacity) {
		super(initialCapacity);
		// TODO Auto-generated constructor stub
	}

	public DefaultLruCache(Map<? extends Integer, ? extends Integer> m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	public DefaultLruCache(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
		// TODO Auto-generated constructor stub
	}

	public DefaultLruCache(int initialCapacity, float loadFactor, boolean accessOrder) {
		super(initialCapacity, loadFactor, accessOrder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int get(int key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void put(int key, int value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCapacity(int capacity) {
		// TODO Auto-generated method stub

	}

}
