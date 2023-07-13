package mayur;

	import java.io.*;
import java.util.LinkedList;
	public class solution123 {
		Node head; 

		
		class Node {
			int data;
			Node next;
			Node(int d)
			{
				data = d;
				next = null;
			}
		}

	
		void printNthFromLast(int N)
		{
			int len = 0;
			Node temp = head;
			while (temp != null) {
				temp = temp.next;
				len++;
			}
			if (len < N)
				return;

			temp = head;

			for (int i = 1; i < len - N + 1; i++)
				temp = temp.next;

			System.out.println(temp.data);
		}

		public void push(int new_data)
		{
			
			Node new_node = new Node(new_data);

			new_node.next = head;

		
			head = new_node;
		}

		
		public static void main(String[] args)
		{
			solution123 llist = new solution123();
			llist.push(10);
			llist.push(5);
			llist.push(100);
			llist.push(5);
			
			
			llist.printNthFromLast(4);
		}
	} 


