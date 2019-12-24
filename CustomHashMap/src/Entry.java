
public class Entry<K,V> {

	K Key;
	V Value;
	Entry(K key,V value){
		this.Key=key;
		this.Value=value;
	}
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return Value;
	}
	public void setValue(V value2) {
		Value = value2;
	}
	
}
