import java.util.*;
class Node {
	public int data;
	public Node next,prev;
	public Node(){
		next = null;
		prev= null;
	}
	public Node(int data){
		this.data = data;
		next= null;
		prev= null;	
	}
	public Node(int data, Node n, Node p){
		this.data =data;
		next=n;
		prev=p;
	}
}
public class DLL {
	 private Node head,tail;//1st node lai head last node lai tail
	 public DLL(){
		 head=tail=null;
	 }
	public boolean isEmpty(){
		return head == null;
}
	public void settoNULL(){
		head=tail=null;
	}
	public int firstEL(){
		if(head!=null)
			return head.data;
		else 
			return -1;
	}
	public void addToHead(int el){
			if(head!=null){
				head=new Node(el,head,null);
			}
			else 
				head=tail=new Node(el);
	}
	public void addToTail(int el){
		if(tail!=null){
			tail= new Node(el,null,tail);
			tail.prev.next=tail;
		}
		else	
			head=tail=new Node(el);
	}
	public int deleteFromHead(){
		if(isEmpty())
			return -1;
		int el=head.data;
		if(head==tail){
			head=tail=null;
		}	
		else{
			head=head.next;
			head.prev=null;
		}
		return el;
	}
	public int deleteFromTail(){
		if(isEmpty()){
			return -1;
			
		}
		int el=tail.data;
		if(head==tail)
			head=tail=null;
		else{
			tail=tail.prev;
			tail.next=null;
			
		}
		return el;
	}
	public void display(){
		Node temp;
		for(temp=head;temp!=null;temp=temp.next){
			System.out.print(temp.data + "|");
		}	
	}
	public static void main(String[] args){
		char c,choice;
		Scanner scan = new Scanner(System.in);
		DLL dl = new DLL();
		do{
		System.out.println("1.Insert into the head");
		System.out.println("2.Insert into the tail");
		System.out.println("3.Delete from the head");
		System.out.println("4.Delete from the tail");
		System.out.println("Enter your choice");
		int select = scan.nextInt();
		switch(select){
			case 1:{
					System.out.println("List before insertion");
					dl.display();
					do{
						System.out.print("Enter the number you want to enter");
						int element = scan.nextInt();
						dl.addToHead(element);
						System.out.println("Inserted into the head");
						dl.display();
						System.out.print("\n\nDo you want to enter another element?(y/n)");
						c = scan.next().charAt(0);
					}while(c=='y' || c=='Y');
					break;
			}
			case 2:{
					System.out.println("List before insertion");
					dl.display();
					do{
						System.out.print("Enter the number you want to enter");
						int element = scan.nextInt();
						dl.addToTail(element);
						System.out.println("Inserted into the tail");
						dl.display();
						System.out.print("\n\nDo you want to enter another element?(y/n)");
						c = scan.next().charAt(0);
					}while(c=='Y' || c=='y');
					break;
			}
			case 3:{
					System.out.println("List before insertion");
					dl.display();
					do{
						dl.deleteFromHead();
						System.out.println("Deleted head from the list");
						dl.display();
						System.out.print("\n\nDo you want to delete another element?(y/n)");
						c = scan.next().charAt(0);
					}while(c=='Y' || c=='y');
					break;
			}
			case 4:{
					System.out.println("List before insertion");
					dl.display();
					do{
						dl.deleteFromtail();
						System.out.println("Deleted from the tail");
						dl.display();
						System.out.print("\n\\nDo you want to delete another element?(y/n)");
						c = scan.next().charAt(0);
					}while(c=='Y' || c=='y');
					break;
			}
			default:{
				System.out.println("Wrong choice");
			}
		}
		System.out.println("Do you want continue from first?(y/n)");
		choice = scan.next().charAt(0);
		}while(choice == 'y' || choice =='Y');
	}
}