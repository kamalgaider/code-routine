

public class Lnkst{

class Node{
	public int val;
	public Node next;
}

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

    public void addAtIndex(int index, int val) {
    	if (index < 0){
			return;
		}
		if(index == 0){
			if(this.head == null){
				this.head = new Node();
				this.head.val = val;
			}
			else{
				Node tmp = new Node();
		    	tmp.val = val;
		    	tmp.next = this.head;
		    	this.head = tmp;
			}
		}
		else if(this.head != null){
			int i = 0;
			this.cur = this.head;
			while(i <= index-1){
				if(i == (index-1)){
					Node tmp = new Node();
		    		tmp.val = val;
		    		tmp.next = this.cur.next;
		    		this.cur.next = tmp;
		    		return;
				}
				this.cur = this.cur.next;
				if(this.cur == null){
					return;
				}
				i++;
			}
		}
    }

	public void deleteIndex(int index){
		if (index < 0){
			return;
		}
		if (this.head != null){
			if (index == 0){
				this.head = this.head.next;
				return;
			}
			else{
				int i =0;
				this.cur = this.head;
				while(i <= index-1){
					if(i == (index-1)){
						if(this.cur.next == null){
							return;
						}
						else{
							this.cur.next = this.cur.next.next;
						}
					}
					i++;
					if(this.cur == null){
							return;
					}
					this.cur =this.cur.next;
				}
			}
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
	
	ls.insertAtHead(38);
	ls.insertAtHead(45);	
	ls.deleteIndex(2);

	ls.addAtIndex(1,24);
	ls.insertAtEnd(36);
	ls.addAtIndex(3,72);
	
	ls.insertAtEnd(76);
	ls.insertAtHead(7);
	ls.insertAtHead(36);
	ls.insertAtHead(34);
	ls.insertAtEnd(91);
	ls.insertAtEnd(69);
	ls.insertAtHead(37);
	ls.insertAtEnd(38);
	ls.insertAtEnd(4);
	ls.insertAtHead(66);
	ls.insertAtEnd(38);
	ls.deleteIndex(99);

	//ls.traverse();
	
	//System.out.println(ls.getIndex(10));
	
	
	}
}