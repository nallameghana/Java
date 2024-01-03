import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList
{
    static Node n;
	static Node head = null;
	static Node temp = null;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		while(true) {
		    System.out.println("1.Insert an element\n2.Display\n3.Delete\n4.Exit");
		    int ch = sc.nextInt();
		    switch(ch) {
		        case 1 : System.out.println("\nEnter an element : ");
		                 int val = sc.nextInt();
		                 head = insertEle(val, head);
		                 break;
		        case 2 : display();
		                 break;
		        case 3 : System.out.println("\nEnter position : ");
		                 int p = sc.nextInt();
		                 head = delete(p, head);
		                 break;
		        case 4 : System.exit(0);
		                 break;
		       default : System.out.println("\nInvalid operation");
		                 break;
		    }
		}
	}
	static Node insertEle(int d, Node head) {
		    n = new Node(d);
		    if(head == null) {
		        head = n;
		        temp = n;
		    }
		    else {
		        while(temp.next != null) {
		            temp = temp.next;
		        }
		        temp.next = n;
		        temp = temp.next;
		    }
		    return head;
		}
	static void display() {
		    Node curr = head;
		    while(curr.next != null) {
		        System.out.print(curr.data + "->");
		        curr = curr.next;
		    }
		    System.out.println(curr.data);
	}
	static Node delete(int p, Node head) {
	    if(p == 1) {
	        head = head.next;
	    }
	    else {
	        Node t = head;
	        for(int i = 1; i < p - 1; i++) {
	            t = t.next;
	        }
	        t.next = t.next.next;
	    }
	    return head;
	}
}
