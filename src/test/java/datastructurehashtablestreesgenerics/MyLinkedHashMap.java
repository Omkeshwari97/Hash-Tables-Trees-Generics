package datastructurehashtablestreesgenerics;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> 
{
	private final int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;
	
	public MyLinkedHashMap() 
	{
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		
		for(int i = 0; i < numBuckets ;i++)
		{
			this.myBucketArray.add(null);
		}
	}

	public  V get(K key) 
	{
		int index = getBucketIndex(key);
		MyLinkedList<K> myLinkedList = myBucketArray.get(index);
		
		if (myLinkedList == null) 
		{
			return null;
		}
	
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}
	
	private int getBucketIndex(K key) 
	{
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		System.out.println("Key : " + key + "hashCode : " + hashCode + "index : " + index);
		return index;
	}
	
	public void add(K key, V value) 
	{
		int index = getBucketIndex(key);
		MyLinkedList<K> myLinkedList = myBucketArray.get(index);
		
		if(myLinkedList == null)
		{
			myLinkedList = new MyLinkedList<>();
			myBucketArray.set(index, myLinkedList);
		}
		
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
		if(myMapNode == null)
		{
			myMapNode = new MyMapNode<>(key, value);
			myLinkedList.append(myMapNode);
		}
		else
		{
			myMapNode.setValue(value);
		}
	}

	public void remove(K key) 
	{
		int index = this.getBucketIndex(key);
		MyLinkedList<K> list = myBucketArray.get(index);
		
		if (list == null) 
		{
			System.out.println("The key does not exist");
			return;
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) list.search(key);
		list.delete(myMapNode);
	}
	
	public String toString() {
		return "MyLinkedHashMap List{" + myBucketArray + "}";
	}
}
