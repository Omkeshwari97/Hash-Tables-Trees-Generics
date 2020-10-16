package datastructurehashtablestreesgenerics;

public class MyLinkedList<K> 
{
	
	public INode head;
	public INode tail;

	public INode<K> search(K key) 
	{
		INode temp = head;
		
		if (tail != null && tail.getKey().equals(key)) 
		{
			return tail;
		}
		else 
		{
			
			while (temp != null && temp.getNext() != null) 
			{
				if (temp.getKey().equals(key)) 
				{
					return temp;
				}
				temp = temp.getNext();
			}
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

	public void delete(INode<K> myNode) 
	{
		INode tempNode1 = head;
		INode tempNode2 = head;
		
		if(head == tail)
		{
			head = null;
			tail = null;
		}
		else 
		{
			while(!tempNode1.getKey().equals(myNode.getKey()) && !tempNode2.equals(tail))
			{
				tempNode2 = tempNode1;
				tempNode1 = tempNode1.getNext();
			}
			
			tempNode2.setNext(tempNode1.getNext());
		}
	}
	
}
