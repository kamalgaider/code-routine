class Node{
	public int val;
	public Node next;
}

public class Lnkst{

	public Node head;
	public Node cur;

	public void insertAtEnd(int v){
		if(this.head != null){
			this.cur = this.head;
			while(this.cur.next != null){
				this.cur = this.cur.next;

			}
			this.cur.next = new Node();
			this.cur.next.val = v;
		}
		else{
			this.head = new Node();
			this.head.val = v;
		}
	}

	public void insertAtHead(int v){
		if(this.head != null){
			Node tmp = new Node();
		    tmp.val = v;
		    tmp.next = this.head;
		    this.head = tmp;
		}
		else{
			this.head = new Node();
			this.head.val = v;
		}
	}

	public void deleteIndex(int index){
		if (index < 0){
			return;
		}
		if (this.head != null){
			if(index == 0){
				this.head = this.head.next;
				return;
			}
			int i = 0;
			this.cur = this.head;
			while(i < index - 1){
				if(this.cur.next != null){
					this.cur = this.cur.next;	
				}
				else{
					return;
				}
				i++;
			}
			this.cur.next = this.cur.next.next; 

		}
		else{
			return;
		}
	}

	public int getIndex(int index){
		if (index < 0){
			return -1;
		}
		if (this.head != null){
			int i = 0;
			this.cur = this.head;
			while(i < index){
				if(this.cur.next != null){
					this.cur = this.cur.next;	
				}
				else{
					return -1;
				}
				i++;
			}
		return this.cur.val;
		}
		else {
			return -1;
		}
	}

	public void traverse(){
		if(this.head != null){
			this.cur = this.head;
			System.out.println("Element at index 0: " + this.cur.val);
			int i = 1;
			while(this.cur.next != null){
				this.cur = this.cur.next;
				System.out.println("Element at index "+ (i++) +": "+ this.cur.val);
			}
		}
		else{
			System.out.println("empty linklist");
		}
	}

	public static void main(String args[]){

	Lnkst ls = new Lnkst();
	ls.traverse();
		System.out.println(ls.getIndex(2));
	ls.insertAtHead(4);
	ls.insertAtEnd(5);
	ls.insertAtEnd(6);
	ls.insertAtEnd(7);
	ls.insertAtHead(3);
	ls.traverse();
	System.out.println(ls.getIndex(2));
	System.out.println(ls.getIndex(10));
	ls.deleteIndex(7);
	ls.traverse();
	}
}