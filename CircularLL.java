import java.util.Scanner;

class CircularLL
{
	static class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}

	Node head = null;

	public void add(int data)
	{
		Node newNode = new Node(data);
		
		if(head==null)
		{
			head=newNode;
			head.next=head;
			return;
		}
		Node temp = head;
		while(temp.next != head)
			temp=temp.next;
		temp.next=newNode;
		newNode.next=head;
	}

	public void calculate_even_sum()
	{
		if(head==null)
		{
			System.out.println("List is empty!");
			return;
		}		
		int sum=0;
		Node temp = head;
		while(temp.next!=head)
		{
			if(temp.data%2==0)
				sum+=temp.data;
			temp=temp.next;
		}
		System.out.println("Sum: "+sum);
	}

	public void display()
	{
		if(head==null)
		{
			System.out.println("Linked List is empty!");
			return;
		}
		Node temp = head;
		while(temp.next != head)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int ch=0,val;
		Scanner sc = new Scanner(System.in);
		CircularLL obj = new CircularLL();
		do{
			System.out.print("\n-----------MENU---------");
			System.out.print("\n1. Add a new element to the end \n2. Compute Sum \n3. Display List \n0. Exit.");
			System.out.print("\nEnter your choice: ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("\nEnter a value: ");
					val = sc.nextInt();
					obj.add(val);
					break;
				case 2:
					obj.calculate_even_sum();
					break;
				case 3:
					obj.display();
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid Option");
					break;
			}
		}while(ch!=0);
		sc.close();
	}
}
