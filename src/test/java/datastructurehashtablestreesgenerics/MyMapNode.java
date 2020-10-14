package datastructurehashtablestreesgenerics;

public class MyMapNode<K, V> implements INode<K> 
{
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) 
	{
		this.key = key;
		this.value = value;
		next = null;
	}

	public K getKey() 
	{
		return key;
	}

	public void setKey(K key) 
	{
		this.key = key;

	}

	public V getValue() 
	{
		return value;
	}

	public void setValue(V value) 
	{
		this.value = value;
	}

	public INode getNext() 
	{
		return next;
	}

	public void setNext(INode next) 
	{
		this.next = (MyMapNode) next;

	}

	public String toString() 
	{
		StringBuilder string = new StringBuilder();
		string.append("MyMapNodes{" + "K=").append(key).append(" V=").append(value).append("}");
		if (next != null) 
		{
			string.append("->").append(next);
		}
		return string.toString();
	}
}
