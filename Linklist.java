
public class Linklist
{
	private Node head; 
	public Linklist()
	{
		this.head=null;
	}
	public Linklist(Node head)
	{
		this.head=head;
	}
	//----------------------------------------------------------------------------------------
	public void insert(int data)
	{
	   Node tmp = new Node(data);
	   if(head==null)
	   {
		   head=tmp;
		   head.next=head;
	   }
	   else
	   {
		   Node it=head;
		   while(it.next != head)
		   {
			   it=it.next;
		   }
		   
		   it.next=tmp;
		   tmp.next=head;
		   head=tmp;
		   
	   }


	}
	//--------------------------------------------------------------------------------------
	public void append(int data)
	{
		Node tmp=new Node(data);
		if(head==null)
		{
			head=tmp;
			head.next=head;
		}
		else
		{
			Node it=head;
			while(it.next!=head)
			{
				it=it.next;
			}
			it.next=tmp;
			tmp.next=head;
			
		}
		
		
		
		
	}
//	//--------------------------------------------------------------------------------------
	public void insertbypostion(int data,int pos)
	{
		int length=get_length();
		
		if(pos==1)
		{
			insert(data);
		}
		else if(pos == length+1)
		{
			append(data);
			
		}
		else if(pos>1 && pos<length+1)
		{
			Node tmp=new Node(data);
			Node it = head;
			for(int i=1;i<pos-1;i++)
			{
				it=it.next;
			}
			tmp.next=it.next;
			it.next=tmp;
		}
		else
		{
			System.out.println("POSITION INVALID:");
		}
	}

	//--------------------------------------------------------------------------------------
	
	
	
	public void deletefirst()
	{
	if(head==null)
	{
		System.out.println("Circular Linked List is Empty:");
	}
		else if(head.next==head)
		{
			head.next=null;
			head=null;
		}
		else
		{
			Node tmp=head;
			Node it=head;
			while(it.next != head)
			{
				it=it.next;
			}
			head=head.next;
			it.next=head;
			tmp.next=null;
				
		}
	}
	
	
	//--------------------------------------------------------------------------------------
	
	
	public void deletelast()
	{
		if(head==null)
		{
			System.out.println("CIRCULAR LINKED LIST IS EMPTY");
		}
		else if(head.next==head)
		{
			head.next=null;
			head=null;
		}
		else
		{
		
			Node it=head.next;
			while(it.next.next != head)
			{
				it=it.next;
			}
			Node tmp=it.next;
			it.next=head;
			tmp.next=null;
		}
		
		
		
    }
	//--------------------------------------------------------------------------------------
	public void deletebypos(int pos)
	{
		
		int length=get_length();
		if(pos==1)
		{
			deletefirst();
		}
		else if(pos==length+1)
		{
			deletelast();
		}
		else if (pos>1 && pos<length)
		{
			Node it=head;
			Node tmp=new Node(pos);
			for(int i=1;i<pos-1;i++)
			{
				it=it.next;
			}
			tmp=it.next.next;
			it.next.next=null;
			it.next=tmp;
		}
		else
		{
			System.out.println("POSITION IS INVALID");
		}
		
		
		
	}
	
	
	
	
	//--------------------------------------------------------------------------------------

	public int get_length()
    {
    	if(head==null)
    	{
    		return 0;
    	}
    	else
    	{
    		int noofnodes=1;
    		Node it=head;
    		while(it.next != head)
    		{
    			noofnodes++;
    			it=it.next;
    		}
    		
    		return noofnodes;
    	}
  
    	
    	
    	
	}
//
//
//	


	
	public String toString()
	{
		String str =" ";
		if(head==null)
		{
			str="Circular Linked list is empty";
		}
		else
		{
			str=str+head.data+",";
			Node it=head.next;
			while(it != head)
			{
				str=str+it.data+",";
				it=it.next;
			}
		}
	    return str;
	}


}
