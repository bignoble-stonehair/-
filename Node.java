import java.util.HashSet;
import java.util.Set;

public class Node{
	Node next = null;
	int data;

	public Node(int d) {
		data = d;
	}

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	Node deleteNode(Node head, int d) {
		Node n = head;

		if(n.data == d) {
			return head.next;
		}
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}

	void distinctNode() {
		Node n = this;
		Set<Integer> set = new HashSet<Integer>();
		Node previous = null;
		while(n != null) {
			if(set.contains(n.data)) {
				previous.next = n.next;
			}
			else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
}