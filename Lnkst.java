class Node{
	public int val;
	public Node next;
}

public class Lnkst{

	public Node head;
	public Node cur;

	public void insertAtEnd(int v){

		if (this.head == null){
			this.head = new Node();
			this.head.val = v;
		}
		else{
			this.cur = this.head;
			while(this.cur.next != null){
				this.cur = this.cur.next;

			}
			this.cur.next = new Node();
			this.cur.next.val = v;
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
	ls.insertAtEnd(5);
	ls.insertAtEnd(6);
	ls.insertAtEnd(7);
	ls.insertAtEnd(8);
	ls.insertAtEnd(9);
	ls.traverse();
	}
}