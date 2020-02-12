package ds;

public class LL {

	Node head;
	public void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	public void insertatstart(int data) {
		Node temp=new Node();
		temp.data=data;
		temp.next=head;
		head=temp;
	}
	
	public void insertat(int pos,int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(pos==0) {
			insertatstart(data);
			return;
		}
		Node n=head;
		for(int i=0;i<pos-1;i++)
			n=n.next;
		node.next=n.next;
		n.next=node;
	}
	
	public void delete(int pos) {
		Node n=head;
		if(pos==0) {
			head=head.next;
			return;
		}
		for(int i=0;i<pos-1;i++)
			n=n.next;
		Node temp=n.next.next;
		n.next=null;
		n.next=temp;
	}
	
	public void reverse() {
		
	}
	 
	
	public void show() {
		Node n=head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
}
