import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackLLImplementation 
{
    static Node head = null;
    static Node tail = null;
    static Node n;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while(true) {
		System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Length\n5.Exit");
		int ch = sc.nextInt();
		  switch(ch) {
		    case 1 : System.out.print("\nEnter data : ");
		             int d = sc.nextInt();
		             head = push(d, head);
		             break;
		    case 2 : pop(head);
		             break;
		    case 3 : int e = peek();
		             System.out.println(e);
		             break;
		    case 4 : int l = length(head);
		             System.out.println(l);
		             break;
		    case 5 : System.exit(0);
		             break;
		  }
	    }
	}
	static Node push(int data, Node head) {
	    n = new Node(data);
	    if(head == null) {
	        head = n;
	        tail = n;
	    }
	    else {
	        tail.next = n;
	        tail = tail.next;
	    }
	    return head;
	}
	static void pop(Node head) {
	    if(head.next == null) {
	        head = null;
	    }
	    else {
	        Node t = head;
	        while(t.next.next != null) {
	            t = t.next;
	        }
	        t.next = null;
	        tail = t;
	    }
	}
	static int peek() {
	    if(head == null) {
	        return -1;
	    }
	    else {
	        return tail.data;
	    }
	}
	static int length(Node head) {
	    Node t1 = head;
	    int c = 0;
	    while(t1 != null) {
	        c += 1;
	        t1 = t1.next;
	    }
	    return c;
	}
	
	
}
