package datastructurehashtablestreesgenerics;

public class MyHashMap<K, V>
{
	MyLinkedList<K> myLinkedList;

	public MyHashMap() 
	{
		myLinkedList = new MyLinkedList<>();
	}
	
	public void add(K key, V value) 
	{
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		
		if (myMapNode == null) 
		{
			myMapNode = new MyMapNode<>(key, value);
			this.myLinkedList.append(myMapNode);
		} 
		else 
		{
			myMapNode.setValue(value);
		}
	}

	public V get(K key) 
	{
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
		
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public String toString() 
	{
		return "MyHashNodes{" + myLinkedList + " }";
	}
}
