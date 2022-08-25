 class SLinsertion{//main class
	class Node{//nodes are battas
		int data;//data
		Node next;//next to hold adress of next node		
		Node(int data){//constructor
			this.data= data;
			next=null;
		}
	}
	Node first;//head node..first ko node ko value store garne kam
	//insertion at first
	public void firstInsert(int d){
		Node node=new Node(d);//node obj banayo naya node thapeko
		node.next=first;//naya node ko next lai linked list ko first exsitde node ko value xa vanera halyo and first ko value tala change grdyo
		first=node;//first le xai naya node lai point garako
	}

	//last insertion
	
	public void lastInsert(int d){
		Node node=new Node(d);//paila naya nmode banayo
		if (first==null){//aba if first ma kei xaina vaya tslai nai node manyo junki 1st and last
			first= node;
			return;
		}
		Node temp=first;//temp ma first ko adress/value liyo
		while(temp.next!=null)//aba temp.next xai null navaya smma loop chalayo so that last smma pugos
		{
			temp=temp.next;//last smma pugna lai
		}
		temp.next=node;//lsat smma puge paxi temp.next le xai yo node ko value linxa
		node.next=null;//and node.next =null garesi last hunxa yo node
		return;
		
	}

	//insertion at specific position
	public void specInsert(int d, int pos){//d=4, pos=2
		Node node= new Node(d);
		if(pos==1){
			node.next=first;
			first=node;
		}else{
			Node temp1=first;//temp1=2
			Node temp=first;//temp=2
			int count=1;
			while(temp1.next!=null && count<=pos-1){//temp.next=3 && 2<=(2-1=1)
				temp=temp1;//temp=2
				temp1= temp1.next;//temp1=1
				count++;//count=2
			}
			if(pos==count){//2==2
				node.next=temp1;//node.next=1
				temp.next=node;//temp.next=4
				
			}else{
				System.out.println("\nOut of bound");
			}
		}

	}

	//deletion at first
	public void firstDelete(){
		Node temp = first;//first ko value liyo
		first= temp.next;//first =afnai value.next ain ez 
	}

	//last deletion
	
	public void lastDelete(){
		if (first==null){
			System.out.println("Empty list");
		}
		Node temp=first;
		Node temp1=null;
		while(temp.next!=null)
		{
			temp1=temp;
			temp=temp.next;
		}
		temp1.next=null;
		temp=null;
		return;
		
	}

	//deletion at specific position
	public void specDelete(int pos){
		if(pos==1){
			Node temp = first;
			first= temp.next;
		}else{
			Node temp1=first;
			Node temp=first;
			int count=1;
			while(temp1.next!=null && count<=pos-1){
				temp=temp1;
				temp1= temp1.next;
				count++;
			}
			if(pos==count){
				temp.next=temp1.next;
				temp1=null;
				
			}else{
				System.out.println("\nOut of bound");
			}
		}

	}
	
	//display
	public void display(){
		Node temp=first;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}

	
	//main method
	public static void main(String[] args){
		
		//Scanner scan = new Scanner(System.in);
		SLinsertion i = new SLinsertion();
		i.firstInsert(1);
		i.firstInsert(2);
		i.lastInsert(3);
		i.lastInsert(5);
		i.lastInsert(5);
		System.out.println("\nBefore deletion of first number");
		i.display();
		System.out.println("\nAfter deletion of first number");
		i.firstDelete();
		i.display();
		System.out.println("\nAfter deletion of last number");
		i.lastDelete();
		i.display();
		i.specInsert(4,3);
		System.out.println("\nAfter insertion in 3 th position");
		i.display();
		System.out.println("\nAfter deletion in 4 th position");
		i.specDelete(4);
		i.display();
		
	}
}
