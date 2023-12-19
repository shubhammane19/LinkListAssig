import java.util.*;

class Node{
	
	int data;
	Node prev;
	Node next = null;
	Node(int data){
		
		this.data = data;
	}
}

class RevLinkList{
	
	Node head = null;
	
	void addNode(int data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			
			head = newNode;
		}else{
			
			Node temp = head;
			while(temp.next != null){
				
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	void printSLL(){
		
		if(head == null){
			
			System.out.println("LinkedList is empty");
		}else{
			
			Node temp = head;
			while(temp.next != null){
				
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	void reverseItr(){
		
		Node prev = null;
		Node curr = head;
		Node forward = null;
		
		while(curr != null){
			
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		head = prev;
	}
	
	void revserseRec(Node prev, Node curr){
		
		if(curr == null){
			head = prev;
			return;
		}else{
			
			Node forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		revserseRec(prev, curr);
		
	}
}

class Client{
	
	public static void main(String[] args){
		
		RevLinkList ll = new RevLinkList();
		
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			
			System.out.println("1.addNode");
			System.out.println("2.printSLL");
			System.out.println("3.reverseItr");
			System.out.println("4.revserseRec");

			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch(choice){
				
				case 1:{
					
					System.out.println("Enter data:");
					int data = sc.nextInt();
					ll.addNode(data);
				}
				break;
				
				case 2: {
					
					ll.printSLL();
					break;
				}
				
				case 3: {
					
					ll.reverseItr();
					break;
				}
				
				case 4: {
					
					Node prev = null;
					ll.revserseRec(prev, ll.head);
				}
				break;
				
				default: 
					System.out.println("Wrong Choice");
					break;
			}
			
			System.out.println("Do you want to continue?");
			ch = sc.next().charAt(0);
			
		}while(ch == 'Y' || ch == 'y');
		
	}
}

