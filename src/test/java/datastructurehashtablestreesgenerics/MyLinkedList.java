package datastructurehashtablestreesgenerics;

public class MyLinkedList<K> 
{
	
	public INode head;
	public INode tail;

	public INode<K> search(K key) 
	{
		INode temp = head;
		
		while (temp != null && temp.getNext() != null) 
		{
			if (temp.getKey().equals(key)) 
			{
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	
	public void append(INode<K> myNewNode) 
	{
		if (head == null) 
		{
			this.head = myNewNode;
		}
		if (tail == null) 
		{
			this.tail = myNewNode;
		} 
		else 
		{
			this.tail.setNext(myNewNode);
			this.tail = myNewNode;
		}
	}

	public void display() 
	{
		System.out.println("My Nodes: " + head);
	}

	public String toString() 
	{
		return "MyLinkedListNode{" + head + "}";
	}
}
