import java.util.*;

class Node{
	
	int data;
	Node next = null;
	Node(int data){
		
		this.data = data;
	}
}

class LinkedList1{
	
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
	int countNode(){
		
		Node temp = head;
		int count = 0;
		
		while(temp != null){
			
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	void printll(){
		
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
}

class Client1{
	
	public static void main(String[] args){
		
		LinkedList1 ll = new LinkedList1();
			
		Scanner sc = new Scanner(System.in);
		
		char ch;
		
		do{
			
			System.out.println("1.addNode");
			System.out.println("2.printll");
			System.out.println("3.countNode");
			
			System.out.println("Enter choice");
			
			int choice = sc.nextInt();
				
			switch(choice){
				
				case 1: {
					
					System.out.println("Enter data");
					int data = sc.nextInt();
					ll.addNode(data);
				}
				break;
				
				case 2:{
					
					ll.printll();
					break;
				}
				
				case 3:{
					
					int count = ll.countNode();
					System.out.println(count);
					break;
				}
				
				default:{
					
					System.out.println("Wrong choice");
				}
			}
			
			System.out.println("Do you want to continue?");
			ch = sc.next().charAt(0);
			
			
		}while(ch == 'Y' || ch == 'y');
	}
}