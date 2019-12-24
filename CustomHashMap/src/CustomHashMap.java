import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomHashMap<K,V>  {


	public List<ListNode> bucket=new ArrayList<ListNode>(Collections.nCopies(4, null)); //it can be array or arrayList
	int capacity=4;
	
	
	
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	public V get(K key) {
		// TODO Auto-generated method stub
	int hash=hash(key);
	V value=null;;
	ListNode currentEntry=bucket.get(hash);
	while(currentEntry!=null) {
	if(currentEntry.entry.getKey().equals(key)) {
		value= (V) currentEntry.entry.getValue();
	break;
	}else {
		currentEntry=currentEntry.next;
	}
		
	
	}
	return value;
	}
	
	
	@SuppressWarnings("ALL")
	public void put(K key, V value) {
		// TODO Auto-generated method stub
	int hash=hash(key);
	ListNode currentEntry=bucket.get(hash);
	Entry ent=new Entry<>(key, value);
	ListNode newEntry=new ListNode(ent, null);

	if(currentEntry==null)
	{
		
		bucket.add(hash, newEntry);
	}
	else {
		 if(currentEntry.next==null){
			 if(currentEntry.entry.Key.equals(key))
				{
				 ent.setValue(value);
				 currentEntry.setNext(newEntry);
				}
		 }
		 else
		 {
		
		while((currentEntry=currentEntry.next)!=null) { //travers to last Node 
		
			if(currentEntry.entry.Key.equals(key))
			{
				 ent.setValue(value);
				 currentEntry.setNext(newEntry);
			}
				
			
		}
		}
	}
		System.out.println("element added successfuly");
		
	}




	
	public int size() {
		// TODO Auto-generated method stub
		return bucket.size();
	}

	

	
	
	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

public int hash(K key) 
{
int k=	key.hashCode();
int hash= Math.abs(key.hashCode())%capacity;
System.out.println("hash"+hash);
return hash;
}
	



public void InilizeMapCapacity(int size) {
	this.capacity=bucket.size();
}

	/*
	 * public static class Entry<k,v>{ private k key; private v value;
	 * 
	 * 
	 * }
	 */
	

public static void main(String[] args) {
	

	 List<ListNode> bucket2=new ArrayList<ListNode>(4);
	 /*
		 * bucket3.add("1"); bucket3.add("2"); bucket3.add("3"); bucket3.add("4");
		 * bucket3.add("5");
		 */
	 
	CustomHashMap<String,String> map=new CustomHashMap<>();
	
	
	map.put("name", "madhu");
	map.put("nema", "madhukumar");

	String s=map.get("name");
	//Iterator it=map.entry
			
	System.out.println("map get value="+map.get("name"));
}

	
}
